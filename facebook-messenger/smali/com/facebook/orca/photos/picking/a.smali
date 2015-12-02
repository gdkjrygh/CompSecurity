.class Lcom/facebook/orca/photos/picking/a;
.super Ljava/lang/Object;
.source "MediaChoiceDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/photos/picking/MediaChoiceDialog;


# direct methods
.method constructor <init>(Lcom/facebook/orca/photos/picking/MediaChoiceDialog;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lcom/facebook/orca/photos/picking/a;->a:Lcom/facebook/orca/photos/picking/MediaChoiceDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 103
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/a;->a:Lcom/facebook/orca/photos/picking/MediaChoiceDialog;

    invoke-static {v0}, Lcom/facebook/orca/photos/picking/MediaChoiceDialog;->a(Lcom/facebook/orca/photos/picking/MediaChoiceDialog;)Ljava/util/EnumMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/EnumMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 104
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_0

    .line 105
    iget-object v1, p0, Lcom/facebook/orca/photos/picking/a;->a:Lcom/facebook/orca/photos/picking/MediaChoiceDialog;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/picking/b;

    # getter for: Lcom/facebook/orca/photos/picking/b;->result:Lcom/facebook/orca/photos/picking/d;
    invoke-static {v0}, Lcom/facebook/orca/photos/picking/b;->access$200(Lcom/facebook/orca/photos/picking/b;)Lcom/facebook/orca/photos/picking/d;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/orca/photos/picking/MediaChoiceDialog;->a(Lcom/facebook/orca/photos/picking/MediaChoiceDialog;Lcom/facebook/orca/photos/picking/d;)Lcom/facebook/orca/photos/picking/d;

    .line 111
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/a;->a:Lcom/facebook/orca/photos/picking/MediaChoiceDialog;

    invoke-static {v0}, Lcom/facebook/orca/photos/picking/MediaChoiceDialog;->b(Lcom/facebook/orca/photos/picking/MediaChoiceDialog;)Lcom/facebook/orca/photos/picking/d;

    move-result-object v0

    if-nez v0, :cond_2

    .line 112
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/a;->a:Lcom/facebook/orca/photos/picking/MediaChoiceDialog;

    sget-object v1, Lcom/facebook/orca/photos/picking/d;->CANCEL:Lcom/facebook/orca/photos/picking/d;

    invoke-static {v0, v1}, Lcom/facebook/orca/photos/picking/MediaChoiceDialog;->a(Lcom/facebook/orca/photos/picking/MediaChoiceDialog;Lcom/facebook/orca/photos/picking/d;)Lcom/facebook/orca/photos/picking/d;

    .line 115
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/a;->a:Lcom/facebook/orca/photos/picking/MediaChoiceDialog;

    invoke-virtual {v0}, Lcom/facebook/orca/photos/picking/MediaChoiceDialog;->a()V

    .line 116
    return-void
.end method
