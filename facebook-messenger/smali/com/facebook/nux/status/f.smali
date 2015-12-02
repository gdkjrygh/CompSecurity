.class public Lcom/facebook/nux/status/f;
.super Lcom/facebook/config/background/a;
.source "NuxStatusConfigurationComponent.java"


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
.field private final b:Lcom/facebook/nux/status/a;

.field private final c:Lcom/facebook/nux/status/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/nux/status/f;

    sput-object v0, Lcom/facebook/nux/status/f;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/nux/status/a;Lcom/facebook/nux/status/j;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/facebook/config/background/a;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/facebook/nux/status/f;->b:Lcom/facebook/nux/status/a;

    .line 29
    iput-object p2, p0, Lcom/facebook/nux/status/f;->c:Lcom/facebook/nux/status/j;

    .line 30
    return-void
.end method

.method static synthetic a(Lcom/facebook/nux/status/f;)Lcom/facebook/nux/status/a;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/nux/status/f;->b:Lcom/facebook/nux/status/a;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/nux/status/f;)Lcom/facebook/nux/status/j;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/nux/status/f;->c:Lcom/facebook/nux/status/j;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/http/protocol/v;
    .locals 2

    .prologue
    .line 34
    new-instance v0, Lcom/facebook/nux/status/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/nux/status/h;-><init>(Lcom/facebook/nux/status/f;Lcom/facebook/nux/status/g;)V

    return-object v0
.end method
