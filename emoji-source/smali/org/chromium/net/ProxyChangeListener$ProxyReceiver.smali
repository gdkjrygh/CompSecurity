.class Lorg/chromium/net/ProxyChangeListener$ProxyReceiver;
.super Landroid/content/BroadcastReceiver;
.source "ProxyChangeListener.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/net/ProxyChangeListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ProxyReceiver"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/net/ProxyChangeListener;


# direct methods
.method private constructor <init>(Lorg/chromium/net/ProxyChangeListener;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lorg/chromium/net/ProxyChangeListener$ProxyReceiver;->this$0:Lorg/chromium/net/ProxyChangeListener;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/chromium/net/ProxyChangeListener;Lorg/chromium/net/ProxyChangeListener$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/chromium/net/ProxyChangeListener;
    .param p2, "x1"    # Lorg/chromium/net/ProxyChangeListener$1;

    .prologue
    .line 88
    invoke-direct {p0, p1}, Lorg/chromium/net/ProxyChangeListener$ProxyReceiver;-><init>(Lorg/chromium/net/ProxyChangeListener;)V

    return-void
.end method

.method private extractNewProxy(Landroid/content/Intent;)Lorg/chromium/net/ProxyChangeListener$ProxyConfig;
    .locals 17
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 104
    :try_start_0
    const-string v4, "getHost"

    .line 105
    .local v4, "getHostName":Ljava/lang/String;
    const-string v8, "getPort"

    .line 106
    .local v8, "getPortName":Ljava/lang/String;
    const-string v5, "getPacFileUrl"

    .line 109
    .local v5, "getPacFileUrl":Ljava/lang/String;
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v15, 0x13

    if-gt v14, v15, :cond_0

    .line 110
    const-string v0, "android.net.ProxyProperties"

    .line 111
    .local v0, "className":Ljava/lang/String;
    const-string v13, "proxy"

    .line 117
    .local v13, "proxyInfo":Ljava/lang/String;
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v14

    invoke-virtual {v14, v13}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    .line 118
    .local v12, "props":Ljava/lang/Object;
    if-nez v12, :cond_1

    .line 119
    const/4 v14, 0x0

    .line 160
    .end local v0    # "className":Ljava/lang/String;
    .end local v4    # "getHostName":Ljava/lang/String;
    .end local v5    # "getPacFileUrl":Ljava/lang/String;
    .end local v8    # "getPortName":Ljava/lang/String;
    .end local v12    # "props":Ljava/lang/Object;
    .end local v13    # "proxyInfo":Ljava/lang/String;
    :goto_1
    return-object v14

    .line 113
    .restart local v4    # "getHostName":Ljava/lang/String;
    .restart local v5    # "getPacFileUrl":Ljava/lang/String;
    .restart local v8    # "getPortName":Ljava/lang/String;
    :cond_0
    const-string v0, "android.net.ProxyInfo"

    .line 114
    .restart local v0    # "className":Ljava/lang/String;
    const-string v13, "android.intent.extra.PROXY_INFO"

    .restart local v13    # "proxyInfo":Ljava/lang/String;
    goto :goto_0

    .line 122
    .restart local v12    # "props":Ljava/lang/Object;
    :cond_1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 123
    .local v1, "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v14, "getHost"

    const/4 v15, 0x0

    new-array v15, v15, [Ljava/lang/Class;

    invoke-virtual {v1, v14, v15}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 124
    .local v3, "getHostMethod":Ljava/lang/reflect/Method;
    const-string v14, "getPort"

    const/4 v15, 0x0

    new-array v15, v15, [Ljava/lang/Class;

    invoke-virtual {v1, v14, v15}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 126
    .local v7, "getPortMethod":Ljava/lang/reflect/Method;
    const/4 v14, 0x0

    new-array v14, v14, [Ljava/lang/Object;

    invoke-virtual {v3, v12, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 127
    .local v9, "host":Ljava/lang/String;
    const/4 v14, 0x0

    new-array v14, v14, [Ljava/lang/Object;

    invoke-virtual {v7, v12, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 130
    .local v11, "port":I
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v15, 0x13

    if-ne v14, v15, :cond_2

    .line 131
    const-string v14, "getPacFileUrl"

    const/4 v15, 0x0

    new-array v15, v15, [Ljava/lang/Class;

    invoke-virtual {v1, v14, v15}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 133
    .local v6, "getPacFileUrlMethod":Ljava/lang/reflect/Method;
    const/4 v14, 0x0

    new-array v14, v14, [Ljava/lang/Object;

    invoke-virtual {v6, v12, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 134
    .local v10, "pacFileUrl":Ljava/lang/String;
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_3

    .line 135
    new-instance v14, Lorg/chromium/net/ProxyChangeListener$ProxyConfig;

    invoke-direct {v14, v9, v11, v10}, Lorg/chromium/net/ProxyChangeListener$ProxyConfig;-><init>(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_4

    goto :goto_1

    .line 146
    .end local v0    # "className":Ljava/lang/String;
    .end local v1    # "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v3    # "getHostMethod":Ljava/lang/reflect/Method;
    .end local v4    # "getHostName":Ljava/lang/String;
    .end local v5    # "getPacFileUrl":Ljava/lang/String;
    .end local v6    # "getPacFileUrlMethod":Ljava/lang/reflect/Method;
    .end local v7    # "getPortMethod":Ljava/lang/reflect/Method;
    .end local v8    # "getPortName":Ljava/lang/String;
    .end local v9    # "host":Ljava/lang/String;
    .end local v10    # "pacFileUrl":Ljava/lang/String;
    .end local v11    # "port":I
    .end local v12    # "props":Ljava/lang/Object;
    .end local v13    # "proxyInfo":Ljava/lang/String;
    :catch_0
    move-exception v2

    .line 147
    .local v2, "ex":Ljava/lang/ClassNotFoundException;
    const-string v14, "ProxyChangeListener"

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v16, "Using no proxy configuration due to exception:"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    const/4 v14, 0x0

    goto :goto_1

    .line 137
    .end local v2    # "ex":Ljava/lang/ClassNotFoundException;
    .restart local v0    # "className":Ljava/lang/String;
    .restart local v1    # "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .restart local v3    # "getHostMethod":Ljava/lang/reflect/Method;
    .restart local v4    # "getHostName":Ljava/lang/String;
    .restart local v5    # "getPacFileUrl":Ljava/lang/String;
    .restart local v7    # "getPortMethod":Ljava/lang/reflect/Method;
    .restart local v8    # "getPortName":Ljava/lang/String;
    .restart local v9    # "host":Ljava/lang/String;
    .restart local v11    # "port":I
    .restart local v12    # "props":Ljava/lang/Object;
    .restart local v13    # "proxyInfo":Ljava/lang/String;
    :cond_2
    :try_start_1
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v15, 0x13

    if-le v14, v15, :cond_3

    .line 138
    const-string v14, "getPacFileUrl"

    const/4 v15, 0x0

    new-array v15, v15, [Ljava/lang/Class;

    invoke-virtual {v1, v14, v15}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 140
    .restart local v6    # "getPacFileUrlMethod":Ljava/lang/reflect/Method;
    const/4 v14, 0x0

    new-array v14, v14, [Ljava/lang/Object;

    invoke-virtual {v6, v12, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/net/Uri;

    .line 141
    .local v10, "pacFileUrl":Landroid/net/Uri;
    sget-object v14, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v14, v10}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3

    .line 142
    new-instance v14, Lorg/chromium/net/ProxyChangeListener$ProxyConfig;

    invoke-virtual {v10}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v14, v9, v11, v15}, Lorg/chromium/net/ProxyChangeListener$ProxyConfig;-><init>(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_4

    goto/16 :goto_1

    .line 149
    .end local v0    # "className":Ljava/lang/String;
    .end local v1    # "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v3    # "getHostMethod":Ljava/lang/reflect/Method;
    .end local v4    # "getHostName":Ljava/lang/String;
    .end local v5    # "getPacFileUrl":Ljava/lang/String;
    .end local v6    # "getPacFileUrlMethod":Ljava/lang/reflect/Method;
    .end local v7    # "getPortMethod":Ljava/lang/reflect/Method;
    .end local v8    # "getPortName":Ljava/lang/String;
    .end local v9    # "host":Ljava/lang/String;
    .end local v10    # "pacFileUrl":Landroid/net/Uri;
    .end local v11    # "port":I
    .end local v12    # "props":Ljava/lang/Object;
    .end local v13    # "proxyInfo":Ljava/lang/String;
    :catch_1
    move-exception v2

    .line 150
    .local v2, "ex":Ljava/lang/NoSuchMethodException;
    const-string v14, "ProxyChangeListener"

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v16, "Using no proxy configuration due to exception:"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    const/4 v14, 0x0

    goto/16 :goto_1

    .line 145
    .end local v2    # "ex":Ljava/lang/NoSuchMethodException;
    .restart local v0    # "className":Ljava/lang/String;
    .restart local v1    # "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .restart local v3    # "getHostMethod":Ljava/lang/reflect/Method;
    .restart local v4    # "getHostName":Ljava/lang/String;
    .restart local v5    # "getPacFileUrl":Ljava/lang/String;
    .restart local v7    # "getPortMethod":Ljava/lang/reflect/Method;
    .restart local v8    # "getPortName":Ljava/lang/String;
    .restart local v9    # "host":Ljava/lang/String;
    .restart local v11    # "port":I
    .restart local v12    # "props":Ljava/lang/Object;
    .restart local v13    # "proxyInfo":Ljava/lang/String;
    :cond_3
    :try_start_2
    new-instance v14, Lorg/chromium/net/ProxyChangeListener$ProxyConfig;

    const/4 v15, 0x0

    invoke-direct {v14, v9, v11, v15}, Lorg/chromium/net/ProxyChangeListener$ProxyConfig;-><init>(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_4

    goto/16 :goto_1

    .line 152
    .end local v0    # "className":Ljava/lang/String;
    .end local v1    # "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v3    # "getHostMethod":Ljava/lang/reflect/Method;
    .end local v4    # "getHostName":Ljava/lang/String;
    .end local v5    # "getPacFileUrl":Ljava/lang/String;
    .end local v7    # "getPortMethod":Ljava/lang/reflect/Method;
    .end local v8    # "getPortName":Ljava/lang/String;
    .end local v9    # "host":Ljava/lang/String;
    .end local v11    # "port":I
    .end local v12    # "props":Ljava/lang/Object;
    .end local v13    # "proxyInfo":Ljava/lang/String;
    :catch_2
    move-exception v2

    .line 153
    .local v2, "ex":Ljava/lang/IllegalAccessException;
    const-string v14, "ProxyChangeListener"

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v16, "Using no proxy configuration due to exception:"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    const/4 v14, 0x0

    goto/16 :goto_1

    .line 155
    .end local v2    # "ex":Ljava/lang/IllegalAccessException;
    :catch_3
    move-exception v2

    .line 156
    .local v2, "ex":Ljava/lang/reflect/InvocationTargetException;
    const-string v14, "ProxyChangeListener"

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v16, "Using no proxy configuration due to exception:"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 157
    const/4 v14, 0x0

    goto/16 :goto_1

    .line 158
    .end local v2    # "ex":Ljava/lang/reflect/InvocationTargetException;
    :catch_4
    move-exception v2

    .line 159
    .local v2, "ex":Ljava/lang/NullPointerException;
    const-string v14, "ProxyChangeListener"

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v16, "Using no proxy configuration due to exception:"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    const/4 v14, 0x0

    goto/16 :goto_1
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 91
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.PROXY_CHANGE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lorg/chromium/net/ProxyChangeListener$ProxyReceiver;->this$0:Lorg/chromium/net/ProxyChangeListener;

    invoke-direct {p0, p2}, Lorg/chromium/net/ProxyChangeListener$ProxyReceiver;->extractNewProxy(Landroid/content/Intent;)Lorg/chromium/net/ProxyChangeListener$ProxyConfig;

    move-result-object v1

    # invokes: Lorg/chromium/net/ProxyChangeListener;->proxySettingsChanged(Lorg/chromium/net/ProxyChangeListener$ProxyConfig;)V
    invoke-static {v0, v1}, Lorg/chromium/net/ProxyChangeListener;->access$000(Lorg/chromium/net/ProxyChangeListener;Lorg/chromium/net/ProxyChangeListener$ProxyConfig;)V

    .line 94
    :cond_0
    return-void
.end method
