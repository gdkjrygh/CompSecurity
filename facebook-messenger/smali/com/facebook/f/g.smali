.class public Lcom/facebook/f/g;
.super Lcom/facebook/config/background/a;
.source "GkConfigurationComponent.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Lcom/facebook/f/a;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/f/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/f/a;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/f/a;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/f/f;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/facebook/config/background/a;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/facebook/f/g;->a:Lcom/facebook/prefs/shared/d;

    .line 34
    iput-object p2, p0, Lcom/facebook/f/g;->b:Lcom/facebook/f/a;

    .line 35
    iput-object p3, p0, Lcom/facebook/f/g;->c:Ljava/util/Set;

    .line 36
    return-void
.end method

.method static synthetic a(Lcom/facebook/f/g;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/f/g;->c:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/f/g;)Lcom/facebook/f/a;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/f/g;->b:Lcom/facebook/f/a;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/f/g;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/f/g;->a:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/http/protocol/v;
    .locals 2

    .prologue
    .line 40
    new-instance v0, Lcom/facebook/f/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/f/i;-><init>(Lcom/facebook/f/g;Lcom/facebook/f/h;)V

    return-object v0
.end method
