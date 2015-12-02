.class public Lcom/qihoo360/common/utils/RootEnhance;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static final ROOT_EXEC_WAIT_TIME:J = 0x4e20L

.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const-class v0, Lcom/qihoo360/common/utils/RootEnhance;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/common/utils/RootEnhance;->a:Ljava/lang/String;

    .line 19
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static rebootSystemIngnoreResult(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 62
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo360/common/utils/RootEnhance$2;

    invoke-direct {v1, p0}, Lcom/qihoo360/common/utils/RootEnhance$2;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 94
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 95
    return-void
.end method

.method public static stopPackageIngnoreResult(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 22
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo360/common/utils/RootEnhance$1;

    invoke-direct {v1, p0, p1}, Lcom/qihoo360/common/utils/RootEnhance$1;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 58
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 59
    return-void
.end method
