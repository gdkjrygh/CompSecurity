.class Lcom/facebook/widget/c/f;
.super Ljava/lang/Object;
.source "OrcaListPreferenceWithSummaryValue.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;


# instance fields
.field final synthetic a:Lcom/facebook/widget/c/e;


# direct methods
.method constructor <init>(Lcom/facebook/widget/c/e;)V
    .locals 0

    .prologue
    .line 23
    iput-object p1, p0, Lcom/facebook/widget/c/f;->a:Lcom/facebook/widget/c/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 2

    .prologue
    .line 28
    invoke-virtual {p2}, Lcom/facebook/prefs/shared/ae;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/c/f;->a:Lcom/facebook/widget/c/e;

    invoke-virtual {v1}, Lcom/facebook/widget/c/e;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 29
    iget-object v0, p0, Lcom/facebook/widget/c/f;->a:Lcom/facebook/widget/c/e;

    invoke-static {v0}, Lcom/facebook/widget/c/e;->a(Lcom/facebook/widget/c/e;)V

    .line 31
    :cond_0
    return-void
.end method
