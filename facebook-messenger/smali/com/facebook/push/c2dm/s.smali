.class public Lcom/facebook/push/c2dm/s;
.super Ljava/lang/Object;
.source "C2dmPushManager.java"

# interfaces
.implements Lcom/facebook/push/f;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/push/c2dm/C2DMRegistrar;

.field private final c:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const-class v0, Lcom/facebook/push/c2dm/s;

    sput-object v0, Lcom/facebook/push/c2dm/s;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/push/c2dm/C2DMRegistrar;Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/push/c2dm/C2DMRegistrar;",
            "Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/facebook/push/c2dm/s;->b:Lcom/facebook/push/c2dm/C2DMRegistrar;

    .line 29
    iput-object p2, p0, Lcom/facebook/push/c2dm/s;->c:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    .line 30
    iput-object p3, p0, Lcom/facebook/push/c2dm/s;->d:Ljavax/inject/a;

    .line 31
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 40
    sget-object v0, Lcom/facebook/push/c2dm/s;->a:Ljava/lang/Class;

    const-string v1, "registering for push notifications"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lcom/facebook/push/c2dm/s;->b:Lcom/facebook/push/c2dm/C2DMRegistrar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/push/c2dm/C2DMRegistrar;->a(Z)V

    .line 42
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 46
    sget-object v0, Lcom/facebook/push/c2dm/s;->a:Ljava/lang/Class;

    const-string v1, "checking push notifications registration"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lcom/facebook/push/c2dm/s;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 48
    iget-object v0, p0, Lcom/facebook/push/c2dm/s;->b:Lcom/facebook/push/c2dm/C2DMRegistrar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/push/c2dm/C2DMRegistrar;->a(Z)V

    .line 50
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 54
    sget-object v0, Lcom/facebook/push/c2dm/s;->a:Ljava/lang/Class;

    const-string v1, "unregistering from push notifications"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcom/facebook/push/c2dm/s;->c:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a()V

    .line 56
    return-void
.end method
