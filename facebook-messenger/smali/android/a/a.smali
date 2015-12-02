.class public Landroid/a/a;
.super Ljava/lang/Object;
.source "IActivityManagerProxyR09.java"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field private final mTo:Landroid/app/IActivityManager;

.field private final mViolationProxy:Lcom/b/a/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/b/a/b",
            "<",
            "Landroid/os/StrictMode$ViolationInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/IActivityManager;Lcom/b/a/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/IActivityManager;",
            "Lcom/b/a/b",
            "<",
            "Landroid/os/StrictMode$ViolationInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Landroid/a/a;->mTo:Landroid/app/IActivityManager;

    .line 41
    iput-object p2, p0, Landroid/a/a;->mViolationProxy:Lcom/b/a/b;

    .line 42
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 48
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "handleApplicationStrictModeViolation"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    .line 51
    aget-object v1, v0, v3

    const-class v2, Landroid/os/IBinder;

    if-ne v1, v2, :cond_0

    aget-object v1, v0, v4

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v1, v2, :cond_0

    aget-object v0, v0, v5

    const-class v1, Landroid/os/StrictMode$ViolationInfo;

    if-ne v0, v1, :cond_0

    .line 52
    iget-object v2, p0, Landroid/a/a;->mTo:Landroid/app/IActivityManager;

    aget-object v0, p3, v3

    check-cast v0, Landroid/os/IBinder;

    aget-object v1, p3, v4

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Landroid/a/a;->mViolationProxy:Lcom/b/a/b;

    aget-object v1, p3, v5

    check-cast v1, Landroid/os/StrictMode$ViolationInfo;

    invoke-virtual {v4, v1}, Lcom/b/a/b;->handle(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/StrictMode$ViolationInfo;

    invoke-interface {v2, v0, v3, v1}, Landroid/app/IActivityManager;->handleApplicationStrictModeViolation(Landroid/os/IBinder;ILandroid/os/StrictMode$ViolationInfo;)V

    .line 57
    const/4 v0, 0x0

    .line 62
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/a/a;->mTo:Landroid/app/IActivityManager;

    invoke-virtual {p2, v0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method
