.class public Lorg/chromium/content/browser/ViewPositionObserver;
.super Ljava/lang/Object;
.source "ViewPositionObserver.java"

# interfaces
.implements Lorg/chromium/content/browser/PositionObserver;


# instance fields
.field private final mListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/chromium/content/browser/PositionObserver$Listener;",
            ">;"
        }
    .end annotation
.end field

.field private final mPosition:[I

.field private mPreDrawListener:Landroid/view/ViewTreeObserver$OnPreDrawListener;

.field private mView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mPosition:[I

    .line 27
    iput-object p1, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mView:Landroid/view/View;

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mListeners:Ljava/util/ArrayList;

    .line 29
    invoke-direct {p0}, Lorg/chromium/content/browser/ViewPositionObserver;->updatePosition()V

    .line 30
    new-instance v0, Lorg/chromium/content/browser/ViewPositionObserver$1;

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/ViewPositionObserver$1;-><init>(Lorg/chromium/content/browser/ViewPositionObserver;)V

    iput-object v0, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mPreDrawListener:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 37
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/content/browser/ViewPositionObserver;)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/content/browser/ViewPositionObserver;

    .prologue
    .line 15
    invoke-direct {p0}, Lorg/chromium/content/browser/ViewPositionObserver;->updatePosition()V

    return-void
.end method

.method private notifyListeners()V
    .locals 5

    .prologue
    .line 89
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v1, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 90
    iget-object v1, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/chromium/content/browser/PositionObserver$Listener;

    iget-object v2, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mPosition:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    iget-object v3, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mPosition:[I

    const/4 v4, 0x1

    aget v3, v3, v4

    invoke-interface {v1, v2, v3}, Lorg/chromium/content/browser/PositionObserver$Listener;->onPositionChanged(II)V

    .line 89
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 92
    :cond_0
    return-void
.end method

.method private updatePosition()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 95
    iget-object v2, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mPosition:[I

    aget v0, v2, v4

    .line 96
    .local v0, "previousPositionX":I
    iget-object v2, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mPosition:[I

    aget v1, v2, v5

    .line 97
    .local v1, "previousPositionY":I
    iget-object v2, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mView:Landroid/view/View;

    iget-object v3, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mPosition:[I

    invoke-virtual {v2, v3}, Landroid/view/View;->getLocationInWindow([I)V

    .line 98
    iget-object v2, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mPosition:[I

    aget v2, v2, v4

    if-ne v2, v0, :cond_0

    iget-object v2, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mPosition:[I

    aget v2, v2, v5

    if-eq v2, v1, :cond_1

    .line 99
    :cond_0
    invoke-direct {p0}, Lorg/chromium/content/browser/ViewPositionObserver;->notifyListeners()V

    .line 101
    :cond_1
    return-void
.end method


# virtual methods
.method public addListener(Lorg/chromium/content/browser/PositionObserver$Listener;)V
    .locals 2
    .param p1, "listener"    # Lorg/chromium/content/browser/PositionObserver$Listener;

    .prologue
    .line 64
    iget-object v0, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    :goto_0
    return-void

    .line 66
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 67
    iget-object v0, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mPreDrawListener:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 68
    invoke-direct {p0}, Lorg/chromium/content/browser/ViewPositionObserver;->updatePosition()V

    .line 71
    :cond_1
    iget-object v0, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public clearListener()V
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 109
    return-void
.end method

.method public getPositionX()I
    .locals 2

    .prologue
    .line 45
    invoke-direct {p0}, Lorg/chromium/content/browser/ViewPositionObserver;->updatePosition()V

    .line 46
    iget-object v0, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mPosition:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public getPositionY()I
    .locals 2

    .prologue
    .line 55
    invoke-direct {p0}, Lorg/chromium/content/browser/ViewPositionObserver;->updatePosition()V

    .line 56
    iget-object v0, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mPosition:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public removeListener(Lorg/chromium/content/browser/PositionObserver$Listener;)V
    .locals 2
    .param p1, "listener"    # Lorg/chromium/content/browser/PositionObserver$Listener;

    .prologue
    .line 79
    iget-object v0, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 86
    :cond_0
    :goto_0
    return-void

    .line 81
    :cond_1
    iget-object v0, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 83
    iget-object v0, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lorg/chromium/content/browser/ViewPositionObserver;->mPreDrawListener:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto :goto_0
.end method
