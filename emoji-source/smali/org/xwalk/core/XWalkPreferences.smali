.class public Lorg/xwalk/core/XWalkPreferences;
.super Ljava/lang/Object;
.source "XWalkPreferences.java"


# static fields
.field public static final ALLOW_UNIVERSAL_ACCESS_FROM_FILE:Ljava/lang/String; = "allow-universal-access-from-file"

.field public static final ANIMATABLE_XWALK_VIEW:Ljava/lang/String; = "animatable-xwalk-view"

.field private static final BRIDGE_CLASS:Ljava/lang/String; = "org.xwalk.core.internal.XWalkPreferencesBridge"

.field public static final JAVASCRIPT_CAN_OPEN_WINDOW:Ljava/lang/String; = "javascript-can-open-window"

.field public static final PROFILE_NAME:Ljava/lang/String; = "profile-name"

.field public static final REMOTE_DEBUGGING:Ljava/lang/String; = "remote-debugging"

.field public static final SUPPORT_MULTIPLE_WINDOWS:Ljava/lang/String; = "support-multiple-windows"


# instance fields
.field private bridge:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getBooleanValue(Ljava/lang/String;)Z
    .locals 7
    .param p0, "key"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 173
    const-string v2, "org.xwalk.core.internal.XWalkPreferencesBridge"

    invoke-static {v2}, Lorg/xwalk/core/ReflectionHelper;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 174
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v2, "getBooleanValue"

    new-array v3, v6, [Ljava/lang/Object;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-static {v0, v2, v3}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 175
    .local v1, "method":Ljava/lang/reflect/Method;
    const/4 v2, 0x0

    new-array v3, v6, [Ljava/lang/Object;

    aput-object p0, v3, v5

    invoke-static {v1, v2, v3}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    return v2
.end method

.method public static getIntegerValue(Ljava/lang/String;)I
    .locals 7
    .param p0, "key"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 188
    const-string v2, "org.xwalk.core.internal.XWalkPreferencesBridge"

    invoke-static {v2}, Lorg/xwalk/core/ReflectionHelper;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 189
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v2, "getIntegerValue"

    new-array v3, v6, [Ljava/lang/Object;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-static {v0, v2, v3}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 190
    .local v1, "method":Ljava/lang/reflect/Method;
    const/4 v2, 0x0

    new-array v3, v6, [Ljava/lang/Object;

    aput-object p0, v3, v5

    invoke-static {v1, v2, v3}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    return v2
.end method

.method public static getStringValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p0, "key"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 203
    const-string v2, "org.xwalk.core.internal.XWalkPreferencesBridge"

    invoke-static {v2}, Lorg/xwalk/core/ReflectionHelper;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 204
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v2, "getStringValue"

    new-array v3, v6, [Ljava/lang/Object;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-static {v0, v2, v3}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 205
    .local v1, "method":Ljava/lang/reflect/Method;
    const/4 v2, 0x0

    new-array v3, v6, [Ljava/lang/Object;

    aput-object p0, v3, v5

    invoke-static {v1, v2, v3}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    return-object v2
.end method

.method public static getValue(Ljava/lang/String;)Z
    .locals 7
    .param p0, "key"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 158
    const-string v2, "org.xwalk.core.internal.XWalkPreferencesBridge"

    invoke-static {v2}, Lorg/xwalk/core/ReflectionHelper;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 159
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v2, "getValue"

    new-array v3, v6, [Ljava/lang/Object;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-static {v0, v2, v3}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 160
    .local v1, "method":Ljava/lang/reflect/Method;
    const/4 v2, 0x0

    new-array v3, v6, [Ljava/lang/Object;

    aput-object p0, v3, v5

    invoke-static {v1, v2, v3}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    return v2
.end method

.method public static setValue(Ljava/lang/String;I)V
    .locals 8
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # I

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 127
    const-string v2, "org.xwalk.core.internal.XWalkPreferencesBridge"

    invoke-static {v2}, Lorg/xwalk/core/ReflectionHelper;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 128
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v2, "setValue"

    new-array v3, v7, [Ljava/lang/Object;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v5

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v3, v6

    invoke-static {v0, v2, v3}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 129
    .local v1, "method":Ljava/lang/reflect/Method;
    const/4 v2, 0x0

    new-array v3, v7, [Ljava/lang/Object;

    aput-object p0, v3, v5

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v1, v2, v3}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    return-void
.end method

.method public static setValue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 142
    const-string v2, "org.xwalk.core.internal.XWalkPreferencesBridge"

    invoke-static {v2}, Lorg/xwalk/core/ReflectionHelper;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 143
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v2, "setValue"

    new-array v3, v7, [Ljava/lang/Object;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v5

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v6

    invoke-static {v0, v2, v3}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 144
    .local v1, "method":Ljava/lang/reflect/Method;
    const/4 v2, 0x0

    new-array v3, v7, [Ljava/lang/Object;

    aput-object p0, v3, v5

    aput-object p1, v3, v6

    invoke-static {v1, v2, v3}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    return-void
.end method

.method public static setValue(Ljava/lang/String;Z)V
    .locals 8
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "enabled"    # Z

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 112
    const-string v2, "org.xwalk.core.internal.XWalkPreferencesBridge"

    invoke-static {v2}, Lorg/xwalk/core/ReflectionHelper;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 113
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v2, "setValue"

    new-array v3, v7, [Ljava/lang/Object;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v5

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v4, v3, v6

    invoke-static {v0, v2, v3}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 114
    .local v1, "method":Ljava/lang/reflect/Method;
    const/4 v2, 0x0

    new-array v3, v7, [Ljava/lang/Object;

    aput-object p0, v3, v5

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v1, v2, v3}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    return-void
.end method


# virtual methods
.method getBridge()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lorg/xwalk/core/XWalkPreferences;->bridge:Ljava/lang/Object;

    return-object v0
.end method
