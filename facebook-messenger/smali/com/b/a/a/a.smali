.class public abstract Lcom/b/a/a/a;
.super Ljava/lang/Object;
.source "AbstractStrictModeSetter.java"

# interfaces
.implements Lcom/b/a/a/g;


# static fields
.field private static final PENALTY_LOG:I = 0x10

.field private static final POLICY_MASK_FIELD:Ljava/lang/String; = "mask"

.field private static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const-class v0, Lcom/b/a/a/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/b/a/a/a;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private clearPenaltyLogBit(II)I
    .locals 1

    .prologue
    .line 179
    xor-int/lit8 v0, p2, -0x1

    and-int/2addr v0, p1

    return v0
.end method

.method private clearPenaltyLogBit(Landroid/os/StrictMode$ThreadPolicy;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 184
    const-string v0, "mask"

    invoke-direct {p0, p1, v0}, Lcom/b/a/a/a;->getPolicyMask(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 185
    const/16 v1, 0x10

    invoke-direct {p0, v0, v1}, Lcom/b/a/a/a;->clearPenaltyLogBit(II)I

    move-result v0

    .line 186
    const-string v1, "mask"

    invoke-direct {p0, p1, v1, v0}, Lcom/b/a/a/a;->setPolicyMask(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 187
    return-void
.end method

.method private clearPenaltyLogBit(Landroid/os/StrictMode$VmPolicy;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 191
    const-string v0, "mask"

    invoke-direct {p0, p1, v0}, Lcom/b/a/a/a;->getPolicyMask(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 192
    const/16 v1, 0x10

    invoke-direct {p0, v0, v1}, Lcom/b/a/a/a;->clearPenaltyLogBit(II)I

    move-result v0

    .line 193
    const-string v1, "mask"

    invoke-direct {p0, p1, v1, v0}, Lcom/b/a/a/a;->setPolicyMask(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 194
    return-void
.end method

.method private createVmBuilder_v11(Landroid/os/StrictMode$VmPolicy;)Landroid/os/StrictMode$VmPolicy$Builder;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 55
    new-instance v0, Landroid/os/StrictMode$VmPolicy$Builder;

    invoke-direct {v0, p1}, Landroid/os/StrictMode$VmPolicy$Builder;-><init>(Landroid/os/StrictMode$VmPolicy;)V

    return-object v0
.end method

.method private createVmBuilder_v9(Landroid/os/StrictMode$VmPolicy;)Landroid/os/StrictMode$VmPolicy$Builder;
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 67
    new-instance v1, Landroid/os/StrictMode$VmPolicy$Builder;

    invoke-direct {v1}, Landroid/os/StrictMode$VmPolicy$Builder;-><init>()V

    .line 70
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 74
    const-string v3, "mask"

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 75
    const-string v3, "mMask"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 77
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 78
    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 80
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    .line 81
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    :goto_0
    return-object v1

    .line 82
    :catch_0
    move-exception v0

    .line 83
    sget-object v2, Lcom/b/a/a/a;->TAG:Ljava/lang/String;

    const-string v3, "Failed to inherit existing VmPolicy mask to VmPolicy.Builder."

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private getPolicyMask(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 5

    .prologue
    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 140
    :try_start_0
    invoke-virtual {v1, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 141
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 142
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 145
    :goto_0
    return-object v0

    .line 143
    :catch_0
    move-exception v0

    .line 144
    sget-object v2, Lcom/b/a/a/a;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to get penalty mask in "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 145
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private isPenaltyLogSet(Ljava/lang/Object;Ljava/lang/String;I)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 161
    invoke-direct {p0, p1, p2}, Lcom/b/a/a/a;->getPolicyMask(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    .line 162
    if-nez v1, :cond_1

    .line 165
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    and-int/2addr v1, p3

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private setPolicyMask(Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 5

    .prologue
    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 152
    :try_start_0
    invoke-virtual {v1, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 153
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 154
    invoke-virtual {v0, p1, p3}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    :goto_0
    return-void

    .line 155
    :catch_0
    move-exception v0

    .line 156
    sget-object v2, Lcom/b/a/a/a;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to set penalty mask in "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private updateThreadPolicy()V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 35
    invoke-static {}, Landroid/os/StrictMode;->getThreadPolicy()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    .line 36
    invoke-virtual {p0, v0}, Lcom/b/a/a/a;->isPenaltyLogSet(Landroid/os/StrictMode$ThreadPolicy;)Z

    move-result v1

    .line 38
    new-instance v2, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v2, v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 39
    invoke-virtual {p0, v2}, Lcom/b/a/a/a;->onUpdateThreadPolicy(Landroid/os/StrictMode$ThreadPolicy$Builder;)Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    .line 41
    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/b/a/a/a;->shouldRestoreThreadPenaltyLog()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 42
    invoke-direct {p0, v0}, Lcom/b/a/a/a;->clearPenaltyLogBit(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 45
    :cond_0
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 46
    return-void
.end method

.method private updateVmPolicy()V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 102
    invoke-static {}, Landroid/os/StrictMode;->getVmPolicy()Landroid/os/StrictMode$VmPolicy;

    move-result-object v0

    .line 103
    invoke-virtual {p0, v0}, Lcom/b/a/a/a;->isPenaltyLogSet(Landroid/os/StrictMode$VmPolicy;)Z

    move-result v1

    .line 105
    invoke-virtual {p0, v0}, Lcom/b/a/a/a;->createVmBuilder(Landroid/os/StrictMode$VmPolicy;)Landroid/os/StrictMode$VmPolicy$Builder;

    move-result-object v0

    .line 106
    invoke-virtual {p0, v0}, Lcom/b/a/a/a;->onUpdateVmPolicy(Landroid/os/StrictMode$VmPolicy$Builder;)Landroid/os/StrictMode$VmPolicy;

    move-result-object v0

    .line 109
    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/b/a/a/a;->shouldRestoreVmPenaltyLog()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 110
    invoke-direct {p0, v0}, Lcom/b/a/a/a;->clearPenaltyLogBit(Landroid/os/StrictMode$VmPolicy;)V

    .line 113
    :cond_0
    invoke-static {v0}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 114
    return-void
.end method


# virtual methods
.method protected createVmBuilder(Landroid/os/StrictMode$VmPolicy;)Landroid/os/StrictMode$VmPolicy$Builder;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 90
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 91
    invoke-direct {p0, p1}, Lcom/b/a/a/a;->createVmBuilder_v11(Landroid/os/StrictMode$VmPolicy;)Landroid/os/StrictMode$VmPolicy$Builder;

    move-result-object v0

    .line 93
    :goto_0
    return-object v0

    .line 92
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_1

    .line 93
    invoke-direct {p0, p1}, Lcom/b/a/a/a;->createVmBuilder_v9(Landroid/os/StrictMode$VmPolicy;)Landroid/os/StrictMode$VmPolicy$Builder;

    move-result-object v0

    goto :goto_0

    .line 96
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method protected abstract getMinimumApiLevel()I
.end method

.method protected isPenaltyLogSet(Landroid/os/StrictMode$ThreadPolicy;)Z
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 170
    const-string v0, "mask"

    const/16 v1, 0x10

    invoke-direct {p0, p1, v0, v1}, Lcom/b/a/a/a;->isPenaltyLogSet(Ljava/lang/Object;Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method protected isPenaltyLogSet(Landroid/os/StrictMode$VmPolicy;)Z
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 175
    const-string v0, "mask"

    const/16 v1, 0x10

    invoke-direct {p0, p1, v0, v1}, Lcom/b/a/a/a;->isPenaltyLogSet(Ljava/lang/Object;Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method protected onUpdateThreadPolicy(Landroid/os/StrictMode$ThreadPolicy$Builder;)Landroid/os/StrictMode$ThreadPolicy;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 50
    invoke-virtual {p1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    return-object v0
.end method

.method protected onUpdateVmPolicy(Landroid/os/StrictMode$VmPolicy$Builder;)Landroid/os/StrictMode$VmPolicy;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 118
    invoke-virtual {p1}, Landroid/os/StrictMode$VmPolicy$Builder;->build()Landroid/os/StrictMode$VmPolicy;

    move-result-object v0

    return-object v0
.end method

.method public set()V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 27
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {p0}, Lcom/b/a/a/a;->getMinimumApiLevel()I

    move-result v1

    if-lt v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 28
    invoke-direct {p0}, Lcom/b/a/a/a;->updateThreadPolicy()V

    .line 29
    invoke-direct {p0}, Lcom/b/a/a/a;->updateVmPolicy()V

    .line 31
    :cond_0
    return-void
.end method

.method protected shouldRestoreThreadPenaltyLog()Z
    .locals 1

    .prologue
    .line 130
    const/4 v0, 0x1

    return v0
.end method

.method protected shouldRestoreVmPenaltyLog()Z
    .locals 1

    .prologue
    .line 134
    const/4 v0, 0x1

    return v0
.end method
