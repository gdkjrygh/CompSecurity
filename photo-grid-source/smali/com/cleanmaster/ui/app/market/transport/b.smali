.class public Lcom/cleanmaster/ui/app/market/transport/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:I

.field public static b:I

.field public static c:Ljava/lang/String;

.field public static d:Ljava/lang/String;

.field public static e:Ljava/lang/String;

.field public static f:Ljava/lang/String;

.field public static g:Ljava/lang/String;

.field public static h:I

.field public static i:Ljava/lang/String;

.field public static j:Ljava/lang/String;

.field private static k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 33
    sput v1, Lcom/cleanmaster/ui/app/market/transport/b;->a:I

    .line 34
    const/16 v0, 0x50

    sput v0, Lcom/cleanmaster/ui/app/market/transport/b;->b:I

    .line 36
    const-string v0, "unad.adkmob.com"

    sput-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->c:Ljava/lang/String;

    .line 37
    const-string v0, "unad.mobad.ijinshan.com"

    sput-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->d:Ljava/lang/String;

    .line 39
    const-string v0, "https"

    sput-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->e:Ljava/lang/String;

    .line 40
    const-string v0, "http"

    sput-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->f:Ljava/lang/String;

    .line 47
    const-string v0, "cm.adkmob.com"

    sput-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->g:Ljava/lang/String;

    .line 48
    sput v1, Lcom/cleanmaster/ui/app/market/transport/b;->h:I

    .line 49
    const-string v0, "/queryUpdate/"

    sput-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->i:Ljava/lang/String;

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "http://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/cleanmaster/ui/app/market/transport/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/cleanmaster/ui/app/market/transport/b;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/b/?action=get_config&mid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->j:Ljava/lang/String;

    .line 120
    const/4 v0, 0x0

    sput-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->k:Ljava/lang/String;

    return-void
.end method

.method public static a(Lorg/apache/http/params/HttpParams;)Lorg/apache/http/conn/ClientConnectionManager;
    .locals 5

    .prologue
    .line 110
    new-instance v0, Lorg/apache/http/conn/scheme/SchemeRegistry;

    invoke-direct {v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V

    .line 112
    new-instance v1, Lorg/apache/http/conn/scheme/Scheme;

    const-string v2, "http"

    invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;

    move-result-object v3

    const/16 v4, 0x50

    invoke-direct {v1, v2, v3, v4}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v0, v1}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 114
    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/transport/b;->a(Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    .line 116
    new-instance v1, Lorg/apache/http/impl/conn/SingleClientConnManager;

    invoke-direct {v1, p0, v0}, Lorg/apache/http/impl/conn/SingleClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    .line 117
    return-object v1
.end method

.method public static a()V
    .locals 1

    .prologue
    .line 122
    sget-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->k:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 124
    :try_start_0
    invoke-static {}, Lcom/cleanmaster/service/a;->a()Lcom/cleanmaster/service/a;

    invoke-static {}, Lcom/cleanmaster/service/a;->b()Ljava/lang/String;

    move-result-object v0

    .line 125
    sput-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/util/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->k:Ljava/lang/String;

    .line 128
    invoke-static {}, Lcom/cleanmaster/service/a;->a()Lcom/cleanmaster/service/a;

    sget-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->k:Ljava/lang/String;

    invoke-static {v0}, Lcom/cleanmaster/service/a;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    :cond_0
    :goto_0
    return-void

    .line 133
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 147
    sput-object p0, Lcom/cleanmaster/ui/app/market/transport/b;->k:Ljava/lang/String;

    .line 148
    return-void
.end method

.method private static a(Lorg/apache/http/conn/scheme/SchemeRegistry;)V
    .locals 4

    .prologue
    .line 67
    new-instance v0, Lcom/cleanmaster/ui/app/market/transport/c;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/transport/c;-><init>()V

    .line 106
    new-instance v1, Lorg/apache/http/conn/scheme/Scheme;

    const-string v2, "https"

    const/16 v3, 0x1bb

    invoke-direct {v1, v2, v0, v3}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {p0, v1}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 107
    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 139
    sget-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->k:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 140
    invoke-static {}, Lcom/cleanmaster/service/a;->a()Lcom/cleanmaster/service/a;

    invoke-static {}, Lcom/cleanmaster/service/a;->b()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->k:Ljava/lang/String;

    .line 143
    :cond_0
    sget-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->k:Ljava/lang/String;

    return-object v0
.end method

.method public static c()Ljava/lang/String;
    .locals 2

    .prologue
    .line 151
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getmAdResourceRp()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 152
    invoke-static {}, Lcom/cleanmaster/ui/app/market/d;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 153
    const-string v0, "sdk.mobad.ijinshan.com"

    .line 165
    :cond_0
    :goto_0
    return-object v0

    .line 155
    :cond_1
    invoke-static {}, Lcom/cleanmaster/ui/app/market/c;->d()Ljava/lang/String;

    move-result-object v0

    .line 156
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 159
    const-string v0, "ssdk.adkmob.com"

    goto :goto_0

    .line 162
    :cond_2
    invoke-static {}, Lcom/cleanmaster/ui/app/market/d;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 163
    sget-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->d:Ljava/lang/String;

    goto :goto_0

    .line 165
    :cond_3
    sget-object v0, Lcom/cleanmaster/ui/app/market/transport/b;->c:Ljava/lang/String;

    goto :goto_0
.end method
