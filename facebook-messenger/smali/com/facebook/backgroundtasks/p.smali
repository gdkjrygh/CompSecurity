.class Lcom/facebook/backgroundtasks/p;
.super Ljava/lang/Object;
.source "BackgroundTaskRunner.java"


# instance fields
.field final a:Lcom/facebook/backgroundtasks/c;

.field b:Z


# direct methods
.method private constructor <init>(Lcom/facebook/backgroundtasks/c;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    iput-object p1, p0, Lcom/facebook/backgroundtasks/p;->a:Lcom/facebook/backgroundtasks/c;

    .line 94
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/backgroundtasks/c;Lcom/facebook/backgroundtasks/k;)V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0, p1}, Lcom/facebook/backgroundtasks/p;-><init>(Lcom/facebook/backgroundtasks/c;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/backgroundtasks/p;->a:Lcom/facebook/backgroundtasks/c;

    invoke-interface {v0}, Lcom/facebook/backgroundtasks/c;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
