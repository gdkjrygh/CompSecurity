.class public Lcom/facebook/backgroundlocation/status/d;
.super Ljava/lang/Object;
.source "BackgroundLocationStatusManager.java"


# static fields
.field public static final a:Ljava/lang/String;

.field private static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/nux/status/j;

.field private final e:Lcom/facebook/fbservice/ops/k;

.field private final f:Lcom/facebook/base/broadcast/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 35
    const-class v0, Lcom/facebook/backgroundlocation/status/d;

    sput-object v0, Lcom/facebook/backgroundlocation/status/d;->b:Ljava/lang/Class;

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/facebook/backgroundlocation/status/d;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".ACTION_RESET_STATE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/backgroundlocation/status/d;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/nux/status/j;Lcom/facebook/fbservice/ops/k;Lcom/facebook/base/broadcast/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/nux/status/j;",
            "Lcom/facebook/fbservice/ops/k;",
            "Lcom/facebook/base/broadcast/j;",
            ")V"
        }
    .end annotation

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/facebook/backgroundlocation/status/d;->c:Ljavax/inject/a;

    .line 56
    iput-object p2, p0, Lcom/facebook/backgroundlocation/status/d;->d:Lcom/facebook/nux/status/j;

    .line 57
    iput-object p3, p0, Lcom/facebook/backgroundlocation/status/d;->e:Lcom/facebook/fbservice/ops/k;

    .line 58
    iput-object p4, p0, Lcom/facebook/backgroundlocation/status/d;->f:Lcom/facebook/base/broadcast/j;

    .line 59
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/backgroundlocation/status/d;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
