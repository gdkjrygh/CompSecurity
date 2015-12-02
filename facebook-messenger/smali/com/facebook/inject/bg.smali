.class Lcom/facebook/inject/bg;
.super Ljava/lang/Object;
.source "ThreadLocalProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private b:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/inject/bf;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/facebook/inject/bg;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/inject/bg;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 23
    iput-object p1, p0, Lcom/facebook/inject/bg;->a:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/inject/bg;)Z
    .locals 1

    .prologue
    .line 23
    iget-boolean v0, p0, Lcom/facebook/inject/bg;->b:Z

    return v0
.end method

.method static synthetic a(Lcom/facebook/inject/bg;Z)Z
    .locals 0

    .prologue
    .line 23
    iput-boolean p1, p0, Lcom/facebook/inject/bg;->b:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/inject/bg;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/inject/bg;->a:Ljava/lang/Object;

    return-object v0
.end method
