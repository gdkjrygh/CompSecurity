.class Lcom/facebook/e/f;
.super Ljava/lang/Object;
.source "DeviceConditionHelper.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;


# instance fields
.field final synthetic a:Lcom/facebook/e/c;


# direct methods
.method constructor <init>(Lcom/facebook/e/c;)V
    .locals 0

    .prologue
    .line 99
    iput-object p1, p0, Lcom/facebook/e/f;->a:Lcom/facebook/e/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 1

    .prologue
    .line 103
    sget-object v0, Lcom/facebook/prefs/shared/aj;->K:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p2, v0}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/facebook/e/f;->a:Lcom/facebook/e/c;

    invoke-static {v0}, Lcom/facebook/e/c;->a(Lcom/facebook/e/c;)V

    .line 106
    :cond_0
    return-void
.end method
