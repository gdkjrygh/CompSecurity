.class Lcom/facebook/widget/c/b;
.super Ljava/lang/Object;
.source "EditTextPreferenceWithSummaryValue.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/widget/c/a;


# direct methods
.method constructor <init>(Lcom/facebook/widget/c/a;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/facebook/widget/c/b;->b:Lcom/facebook/widget/c/a;

    iput-object p2, p0, Lcom/facebook/widget/c/b;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 2

    .prologue
    .line 45
    invoke-virtual {p2}, Lcom/facebook/prefs/shared/ae;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/c/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/facebook/widget/c/b;->b:Lcom/facebook/widget/c/a;

    invoke-static {v0}, Lcom/facebook/widget/c/a;->a(Lcom/facebook/widget/c/a;)V

    .line 48
    :cond_0
    return-void
.end method
