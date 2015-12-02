.class public Lcom/facebook/messages/threads/ui/name/ThreadNameView;
.super Lcom/facebook/widget/text/m;
.source "ThreadNameView.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/widget/text/m",
        "<",
        "Lcom/facebook/messages/threads/ui/name/g;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/facebook/messages/threads/ui/name/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0, p1}, Lcom/facebook/widget/text/m;-><init>(Landroid/content/Context;)V

    .line 40
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/text/m;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    invoke-direct {p0, p1, p2}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 46
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/text/m;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 50
    invoke-direct {p0, p1, p2}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 51
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    .line 54
    invoke-virtual {p0}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/facebook/q;->ThreadNameView:[I

    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 55
    sget v1, Lcom/facebook/q;->ThreadNameView_nameOption:I

    sget-object v2, Lcom/facebook/messages/threads/ui/name/d;->USE_THREAD_NAME_IF_AVAILABLE:Lcom/facebook/messages/threads/ui/name/d;

    # getter for: Lcom/facebook/messages/threads/ui/name/d;->value:I
    invoke-static {v2}, Lcom/facebook/messages/threads/ui/name/d;->access$000(Lcom/facebook/messages/threads/ui/name/d;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    .line 57
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 58
    invoke-virtual {p0}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 59
    sget-object v2, Lcom/facebook/messages/threads/ui/name/d;->USE_THREAD_NAME_IF_AVAILABLE:Lcom/facebook/messages/threads/ui/name/d;

    # getter for: Lcom/facebook/messages/threads/ui/name/d;->value:I
    invoke-static {v2}, Lcom/facebook/messages/threads/ui/name/d;->access$000(Lcom/facebook/messages/threads/ui/name/d;)I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 60
    const-class v1, Lcom/facebook/messages/threads/ui/name/e;

    const-class v2, Lcom/facebook/messages/threads/ui/name/DefaultThreadNameViewComputer;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/ui/name/e;

    iput-object v0, p0, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->a:Lcom/facebook/messages/threads/ui/name/e;

    .line 69
    :goto_0
    return-void

    .line 62
    :cond_0
    sget-object v2, Lcom/facebook/messages/threads/ui/name/d;->USE_PARTICIPANTS_NAMES_ONLY:Lcom/facebook/messages/threads/ui/name/d;

    # getter for: Lcom/facebook/messages/threads/ui/name/d;->value:I
    invoke-static {v2}, Lcom/facebook/messages/threads/ui/name/d;->access$000(Lcom/facebook/messages/threads/ui/name/d;)I

    move-result v2

    if-ne v1, v2, :cond_1

    .line 63
    const-class v1, Lcom/facebook/messages/threads/ui/name/e;

    const-class v2, Lcom/facebook/messages/threads/ui/name/NamesOnlyThreadNameViewComputer;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/ui/name/e;

    iput-object v0, p0, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->a:Lcom/facebook/messages/threads/ui/name/e;

    goto :goto_0

    .line 66
    :cond_1
    const-class v1, Lcom/facebook/messages/threads/ui/name/e;

    const-class v2, Lcom/facebook/messages/threads/ui/name/DefaultThreadNameViewComputer;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/ui/name/e;

    iput-object v0, p0, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->a:Lcom/facebook/messages/threads/ui/name/e;

    goto :goto_0
.end method


# virtual methods
.method protected getVariableTextLayoutComputer()Lcom/facebook/widget/text/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/widget/text/l",
            "<",
            "Lcom/facebook/messages/threads/ui/name/g;",
            ">;"
        }
    .end annotation

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->a:Lcom/facebook/messages/threads/ui/name/e;

    return-object v0
.end method
