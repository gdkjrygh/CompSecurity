.class public Lcom/facebook/abtest/qe/service/d;
.super Ljava/lang/Object;
.source "QuickExperimentRefresher.java"

# interfaces
.implements Lcom/facebook/base/c;


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/base/broadcast/j;

.field private final c:Lcom/facebook/prefs/shared/d;

.field private final d:Lcom/facebook/common/time/a;

.field private e:Lcom/facebook/base/broadcast/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/facebook/abtest/qe/service/d;

    sput-object v0, Lcom/facebook/abtest/qe/service/d;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/base/broadcast/j;Lcom/facebook/prefs/shared/d;Lcom/facebook/common/time/a;)V
    .locals 0
    .param p1    # Lcom/facebook/base/broadcast/j;
        .annotation runtime Lcom/facebook/base/broadcast/LocalBroadcast;
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/facebook/abtest/qe/service/d;->b:Lcom/facebook/base/broadcast/j;

    .line 41
    iput-object p2, p0, Lcom/facebook/abtest/qe/service/d;->c:Lcom/facebook/prefs/shared/d;

    .line 42
    iput-object p3, p0, Lcom/facebook/abtest/qe/service/d;->d:Lcom/facebook/common/time/a;

    .line 43
    return-void
.end method

.method static synthetic a(Lcom/facebook/abtest/qe/service/d;)Lcom/facebook/common/time/a;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/d;->d:Lcom/facebook/common/time/a;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/abtest/qe/service/d;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/d;->c:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 47
    new-instance v0, Lcom/facebook/abtest/qe/service/e;

    invoke-direct {v0, p0}, Lcom/facebook/abtest/qe/service/e;-><init>(Lcom/facebook/abtest/qe/service/d;)V

    .line 57
    iget-object v1, p0, Lcom/facebook/abtest/qe/service/d;->b:Lcom/facebook/base/broadcast/j;

    invoke-interface {v1}, Lcom/facebook/base/broadcast/j;->a()Lcom/facebook/base/broadcast/k;

    move-result-object v1

    sget-object v2, Lcom/facebook/common/v/a;->b:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Lcom/facebook/base/broadcast/k;->a(Ljava/lang/String;Lcom/facebook/c/b;)Lcom/facebook/base/broadcast/k;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/base/broadcast/k;->a()Lcom/facebook/base/broadcast/l;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/service/d;->e:Lcom/facebook/base/broadcast/l;

    .line 60
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/d;->e:Lcom/facebook/base/broadcast/l;

    invoke-interface {v0}, Lcom/facebook/base/broadcast/l;->b()V

    .line 61
    return-void
.end method
