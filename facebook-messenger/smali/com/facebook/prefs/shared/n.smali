.class Lcom/facebook/prefs/shared/n;
.super Ljava/lang/Object;
.source "FbSharedPreferencesImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/facebook/prefs/shared/j;


# direct methods
.method constructor <init>(Lcom/facebook/prefs/shared/j;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 635
    iput-object p1, p0, Lcom/facebook/prefs/shared/n;->b:Lcom/facebook/prefs/shared/j;

    iput-object p2, p0, Lcom/facebook/prefs/shared/n;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 638
    iget-object v0, p0, Lcom/facebook/prefs/shared/n;->b:Lcom/facebook/prefs/shared/j;

    iget-object v1, p0, Lcom/facebook/prefs/shared/n;->a:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/facebook/prefs/shared/j;->b(Lcom/facebook/prefs/shared/j;Ljava/util/List;)V

    .line 639
    return-void
.end method
