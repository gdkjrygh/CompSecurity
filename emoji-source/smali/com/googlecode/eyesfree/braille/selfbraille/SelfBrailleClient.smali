.class public Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;
.super Ljava/lang/Object;
.source "SelfBrailleClient.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$1;,
        Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;,
        Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;
    }
.end annotation


# static fields
.field private static final ACTION_SELF_BRAILLE_SERVICE:Ljava/lang/String; = "com.googlecode.eyesfree.braille.service.ACTION_SELF_BRAILLE_SERVICE"

.field private static final BRAILLE_BACK_PACKAGE:Ljava/lang/String; = "com.googlecode.eyesfree.brailleback"

.field private static final EYES_FREE_CERT_SHA1:[B

.field private static final LOG_TAG:Ljava/lang/String;

.field private static final MAX_REBIND_ATTEMPTS:I = 0x5

.field private static final REBIND_DELAY_MILLIS:I = 0x1f4

.field private static final mServiceIntent:Landroid/content/Intent;


# instance fields
.field private final mAllowDebugService:Z

.field private volatile mConnection:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;

.field private final mContext:Landroid/content/Context;

.field private final mHandler:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;

.field private final mIdentity:Landroid/os/Binder;

.field private mNumFailedBinds:I

.field private mShutdown:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 44
    const-class v0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->LOG_TAG:Ljava/lang/String;

    .line 50
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.googlecode.eyesfree.braille.service.ACTION_SELF_BRAILLE_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.googlecode.eyesfree.brailleback"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    sput-object v0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mServiceIntent:Landroid/content/Intent;

    .line 61
    const/16 v0, 0x14

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->EYES_FREE_CERT_SHA1:[B

    return-void

    nop

    :array_0
    .array-data 1
        -0x65t
        0x42t
        0x4ct
        0x2dt
        0x27t
        -0x53t
        0x51t
        -0x5ct
        0x2at
        0x33t
        0x7et
        0xbt
        -0x4at
        -0x67t
        0x1ct
        0x76t
        -0x14t
        -0x5ct
        0x44t
        0x61t
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "allowDebugService"    # Z

    .prologue
    const/4 v2, 0x0

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    new-instance v0, Landroid/os/Binder;

    invoke-direct {v0}, Landroid/os/Binder;-><init>()V

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mIdentity:Landroid/os/Binder;

    .line 78
    new-instance v0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;-><init>(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$1;)V

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mHandler:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;

    .line 79
    iput-boolean v2, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mShutdown:Z

    .line 87
    iput v2, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mNumFailedBinds:I

    .line 97
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mContext:Landroid/content/Context;

    .line 98
    iput-boolean p2, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mAllowDebugService:Z

    .line 99
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->doBindService()V

    .line 100
    return-void
.end method

.method static synthetic access$1000(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)V
    .locals 0
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->doBindService()V

    return-void
.end method

.method static synthetic access$300(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)Z
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->verifyPackage()Z

    move-result v0

    return v0
.end method

.method static synthetic access$400()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    sget-object v0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->LOG_TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$500(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    .prologue
    .line 43
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mHandler:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;

    return-object v0
.end method

.method static synthetic access$600(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)I
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    .prologue
    .line 43
    iget v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mNumFailedBinds:I

    return v0
.end method

.method static synthetic access$602(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;I)I
    .locals 0
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;
    .param p1, "x1"    # I

    .prologue
    .line 43
    iput p1, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mNumFailedBinds:I

    return p1
.end method

.method static synthetic access$604(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)I
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    .prologue
    .line 43
    iget v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mNumFailedBinds:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mNumFailedBinds:I

    return v0
.end method

.method static synthetic access$700(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)Z
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    .prologue
    .line 43
    iget-boolean v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mShutdown:Z

    return v0
.end method

.method static synthetic access$800(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    .prologue
    .line 43
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mConnection:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;

    return-object v0
.end method

.method static synthetic access$900(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)V
    .locals 0
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->doUnbindService()V

    return-void
.end method

.method private doBindService()V
    .locals 4

    .prologue
    .line 124
    new-instance v0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;-><init>(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$1;)V

    .line 125
    .local v0, "localConnection":Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mContext:Landroid/content/Context;

    sget-object v2, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mServiceIntent:Landroid/content/Intent;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 127
    sget-object v1, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Failed to bind to service"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mHandler:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;

    invoke-virtual {v1}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->scheduleRebind()V

    .line 133
    :goto_0
    return-void

    .line 131
    :cond_0
    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mConnection:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;

    .line 132
    sget-object v1, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Bound to self braille service"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private doUnbindService()V
    .locals 3

    .prologue
    .line 136
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mConnection:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;

    if-eqz v1, :cond_1

    .line 137
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->getSelfBrailleService()Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;

    move-result-object v0

    .line 138
    .local v0, "localService":Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;
    if-eqz v0, :cond_0

    .line 140
    :try_start_0
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mIdentity:Landroid/os/Binder;

    invoke-interface {v0, v1}, Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;->disconnect(Landroid/os/IBinder;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mConnection:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 146
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mConnection:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;

    .line 148
    .end local v0    # "localService":Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;
    :cond_1
    return-void

    .line 141
    .restart local v0    # "localService":Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private getSelfBrailleService()Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;
    .locals 2

    .prologue
    .line 151
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mConnection:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;

    .line 152
    .local v0, "localConnection":Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;
    if-eqz v0, :cond_0

    .line 153
    # getter for: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;->mService:Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;->access$200(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;)Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;

    move-result-object v1

    .line 155
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private verifyPackage()Z
    .locals 14

    .prologue
    const/4 v8, 0x1

    const/4 v9, 0x0

    .line 159
    iget-object v10, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mContext:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    .line 162
    .local v6, "pm":Landroid/content/pm/PackageManager;
    :try_start_0
    const-string v10, "com.googlecode.eyesfree.brailleback"

    const/16 v11, 0x40

    invoke-virtual {v6, v10, v11}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 171
    .local v5, "pi":Landroid/content/pm/PackageInfo;
    :try_start_1
    const-string v10, "SHA-1"

    invoke-static {v10}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    .line 177
    .local v1, "digest":Ljava/security/MessageDigest;
    iget-object v0, v5, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .local v0, "arr$":[Landroid/content/pm/Signature;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_0
    if-ge v3, v4, :cond_1

    aget-object v7, v0, v3

    .line 178
    .local v7, "signature":Landroid/content/pm/Signature;
    invoke-virtual {v7}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v10

    invoke-virtual {v1, v10}, Ljava/security/MessageDigest;->update([B)V

    .line 179
    sget-object v10, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->EYES_FREE_CERT_SHA1:[B

    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v11

    invoke-static {v10, v11}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result v10

    if-eqz v10, :cond_0

    .line 191
    .end local v0    # "arr$":[Landroid/content/pm/Signature;
    .end local v1    # "digest":Ljava/security/MessageDigest;
    .end local v3    # "i$":I
    .end local v4    # "len$":I
    .end local v5    # "pi":Landroid/content/pm/PackageInfo;
    .end local v7    # "signature":Landroid/content/pm/Signature;
    :goto_1
    return v8

    .line 164
    :catch_0
    move-exception v2

    .line 165
    .local v2, "ex":Landroid/content/pm/PackageManager$NameNotFoundException;
    sget-object v8, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->LOG_TAG:Ljava/lang/String;

    const-string v10, "Can\'t verify package com.googlecode.eyesfree.brailleback"

    invoke-static {v8, v10, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move v8, v9

    .line 167
    goto :goto_1

    .line 172
    .end local v2    # "ex":Landroid/content/pm/PackageManager$NameNotFoundException;
    .restart local v5    # "pi":Landroid/content/pm/PackageInfo;
    :catch_1
    move-exception v2

    .line 173
    .local v2, "ex":Ljava/security/NoSuchAlgorithmException;
    sget-object v8, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->LOG_TAG:Ljava/lang/String;

    const-string v10, "SHA-1 not supported"

    invoke-static {v8, v10, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move v8, v9

    .line 174
    goto :goto_1

    .line 182
    .end local v2    # "ex":Ljava/security/NoSuchAlgorithmException;
    .restart local v0    # "arr$":[Landroid/content/pm/Signature;
    .restart local v1    # "digest":Ljava/security/MessageDigest;
    .restart local v3    # "i$":I
    .restart local v4    # "len$":I
    .restart local v7    # "signature":Landroid/content/pm/Signature;
    :cond_0
    invoke-virtual {v1}, Ljava/security/MessageDigest;->reset()V

    .line 177
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 184
    .end local v7    # "signature":Landroid/content/pm/Signature;
    :cond_1
    iget-boolean v10, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mAllowDebugService:Z

    if-eqz v10, :cond_2

    .line 185
    sget-object v10, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->LOG_TAG:Ljava/lang/String;

    const-string v11, "*** %s connected to BrailleBack with invalid (debug?) signature ***"

    new-array v12, v8, [Ljava/lang/Object;

    iget-object v13, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mContext:Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    aput-object v13, v12, v9

    invoke-static {v11, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v10, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_2
    move v8, v9

    .line 191
    goto :goto_1
.end method


# virtual methods
.method public shutdown()V
    .locals 1

    .prologue
    .line 107
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mShutdown:Z

    .line 108
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->doUnbindService()V

    .line 109
    return-void
.end method

.method public write(Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;)V
    .locals 4
    .param p1, "writeData"    # Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;

    .prologue
    .line 112
    invoke-virtual {p1}, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->validate()V

    .line 113
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->getSelfBrailleService()Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;

    move-result-object v1

    .line 114
    .local v1, "localService":Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;
    if-eqz v1, :cond_0

    .line 116
    :try_start_0
    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mIdentity:Landroid/os/Binder;

    invoke-interface {v1, v2, p1}, Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;->write(Landroid/os/IBinder;Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    :cond_0
    :goto_0
    return-void

    .line 117
    :catch_0
    move-exception v0

    .line 118
    .local v0, "ex":Landroid/os/RemoteException;
    sget-object v2, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Self braille write failed"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
