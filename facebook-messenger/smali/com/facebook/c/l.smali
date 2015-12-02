.class public Lcom/facebook/c/l;
.super Ljava/lang/Object;
.source "FacebookOnlyIntentActionFactory.java"


# instance fields
.field private final a:Lcom/facebook/base/j;


# direct methods
.method public constructor <init>(Lcom/facebook/base/j;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/j;

    iput-object v0, p0, Lcom/facebook/c/l;->a:Lcom/facebook/base/j;

    .line 27
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 34
    const-string v0, "com.facebook.intent.action.%s.%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/facebook/c/l;->a:Lcom/facebook/base/j;

    invoke-virtual {v3}, Lcom/facebook/base/j;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
