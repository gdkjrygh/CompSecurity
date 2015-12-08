.class public Lcom/thetransitapp/droid/widget/ListViewItem;
.super Ljava/lang/Object;
.source "ListViewItem.java"


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
.field private title:Ljava/lang/String;

.field private value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 16
    .local p0, "this":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<TT;>;"
    .local p1, "value":Ljava/lang/Object;, "TT;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/ListViewItem;->value:Ljava/lang/Object;

    .line 18
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 12
    .local p0, "this":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/ListViewItem;->title:Ljava/lang/String;

    .line 14
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<TT;>;"
    const/4 v1, 0x0

    .line 35
    instance-of v2, p1, Lcom/thetransitapp/droid/widget/ListViewItem;

    if-nez v2, :cond_1

    .line 49
    :cond_0
    :goto_0
    return v1

    :cond_1
    move-object v0, p1

    .line 39
    check-cast v0, Lcom/thetransitapp/droid/widget/ListViewItem;

    .line 41
    .local v0, "item":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<*>;"
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/ListViewItem;->hasValue()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/ListViewItem;->hasValue()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 42
    iget-object v1, v0, Lcom/thetransitapp/droid/widget/ListViewItem;->value:Ljava/lang/Object;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/ListViewItem;->value:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/ListViewItem;->hasValue()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/ListViewItem;->hasValue()Z

    move-result v2

    if-nez v2, :cond_0

    .line 46
    iget-object v1, v0, Lcom/thetransitapp/droid/widget/ListViewItem;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/ListViewItem;->title:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 6
    .local p0, "this":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<TT;>;"
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/ListViewItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 6
    .local p0, "this":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<TT;>;"
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/ListViewItem;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public hasValue()Z
    .locals 1

    .prologue
    .line 21
    .local p0, "this":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<TT;>;"
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/ListViewItem;->value:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 26
    .local p0, "this":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<TT;>;"
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/ListViewItem;->hasValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/ListViewItem;->value:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 30
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/ListViewItem;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 7
    .local p0, "this":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<TT;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/ListViewItem;->title:Ljava/lang/String;

    return-void
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 7
    .local p0, "this":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<TT;>;"
    .local p1, "value":Ljava/lang/Object;, "TT;"
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/ListViewItem;->value:Ljava/lang/Object;

    return-void
.end method
