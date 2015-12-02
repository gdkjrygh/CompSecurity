.class public Lcom/facebook/reflex/view/c/o;
.super Ljava/lang/Object;
.source "SelectionController.java"


# instance fields
.field private final a:Lcom/facebook/reflex/view/h;

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/facebook/reflex/view/c/r;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/reflex/Widget;

.field private final d:Lcom/facebook/reflex/Widget;

.field private final e:Lcom/facebook/reflex/animation/System;

.field private final f:Lcom/facebook/reflex/animation/Change;

.field private final g:Lcom/facebook/reflex/animation/Change;

.field private final h:Lcom/facebook/reflex/view/c/q;

.field private i:Lcom/facebook/reflex/Color;

.field private j:Lcom/facebook/reflex/Color;

.field private k:I

.field private l:Z

.field private m:Z


# direct methods
.method public constructor <init>(Lcom/facebook/reflex/view/h;Lcom/facebook/reflex/Container;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/reflex/view/c/o;->m:Z

    .line 60
    iput-object p1, p0, Lcom/facebook/reflex/view/c/o;->a:Lcom/facebook/reflex/view/h;

    .line 62
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/c/o;->b:Ljava/util/ArrayList;

    .line 63
    new-instance v0, Lcom/facebook/reflex/Container;

    invoke-direct {v0}, Lcom/facebook/reflex/Container;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/c/o;->c:Lcom/facebook/reflex/Widget;

    .line 64
    new-instance v0, Lcom/facebook/reflex/Container;

    invoke-direct {v0}, Lcom/facebook/reflex/Container;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/c/o;->d:Lcom/facebook/reflex/Widget;

    .line 67
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->c:Lcom/facebook/reflex/Widget;

    invoke-virtual {p2, v0}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/Widget;)V

    .line 68
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->d:Lcom/facebook/reflex/Widget;

    invoke-virtual {p2, v0}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/Widget;)V

    .line 70
    new-instance v0, Lcom/facebook/reflex/Color;

    const v1, -0xa06f01

    invoke-direct {v0, v1}, Lcom/facebook/reflex/Color;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/reflex/view/c/o;->i:Lcom/facebook/reflex/Color;

    .line 71
    new-instance v0, Lcom/facebook/reflex/Color;

    const v1, -0xc19a4d

    invoke-direct {v0, v1}, Lcom/facebook/reflex/Color;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/reflex/view/c/o;->j:Lcom/facebook/reflex/Color;

    .line 73
    new-instance v0, Lcom/facebook/reflex/animation/SystemConfig;

    invoke-direct {v0}, Lcom/facebook/reflex/animation/SystemConfig;-><init>()V

    .line 74
    new-instance v1, Lcom/facebook/reflex/animation/PropertyName;

    const-string v2, "selector.opacity"

    invoke-direct {v1, v2}, Lcom/facebook/reflex/animation/PropertyName;-><init>(Ljava/lang/String;)V

    .line 75
    invoke-virtual {v0, v1, v6}, Lcom/facebook/reflex/animation/SystemConfig;->declareVariable(Lcom/facebook/reflex/animation/PropertyName;F)V

    .line 76
    const-string v2, "selector"

    invoke-virtual {v0, v2}, Lcom/facebook/reflex/animation/SystemConfig;->declareWidget(Ljava/lang/String;)V

    .line 77
    const-string v2, "selector"

    sget-object v3, Lcom/facebook/reflex/animation/b;->Opacity:Lcom/facebook/reflex/animation/b;

    invoke-virtual {v0, v2, v3, v1}, Lcom/facebook/reflex/animation/SystemConfig;->a(Ljava/lang/String;Lcom/facebook/reflex/animation/b;Lcom/facebook/reflex/animation/PropertyName;)V

    .line 78
    new-instance v2, Lcom/facebook/reflex/animation/System;

    invoke-direct {v2, v0}, Lcom/facebook/reflex/animation/System;-><init>(Lcom/facebook/reflex/animation/SystemConfig;)V

    iput-object v2, p0, Lcom/facebook/reflex/view/c/o;->e:Lcom/facebook/reflex/animation/System;

    .line 79
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->e:Lcom/facebook/reflex/animation/System;

    const-string v2, "selector"

    iget-object v3, p0, Lcom/facebook/reflex/view/c/o;->d:Lcom/facebook/reflex/Widget;

    invoke-virtual {v0, v2, v3}, Lcom/facebook/reflex/animation/System;->bindWidget(Ljava/lang/String;Lcom/facebook/reflex/Widget;)V

    .line 81
    new-instance v0, Lcom/facebook/reflex/animation/Change;

    invoke-direct {v0}, Lcom/facebook/reflex/animation/Change;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/c/o;->f:Lcom/facebook/reflex/animation/Change;

    .line 82
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->f:Lcom/facebook/reflex/animation/Change;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/animation/Change;->a(Lcom/facebook/reflex/animation/PropertyName;)Lcom/facebook/reflex/animation/a;

    move-result-object v0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Lcom/facebook/reflex/animation/a;->a(F)Lcom/facebook/reflex/animation/a;

    move-result-object v0

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v2

    int-to-double v2, v2

    const-wide v4, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Lcom/facebook/reflex/animation/Transition;->a(D)Lcom/facebook/reflex/animation/Transition;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/reflex/animation/a;->a(Lcom/facebook/reflex/animation/Transition;)Lcom/facebook/reflex/animation/a;

    .line 84
    new-instance v0, Lcom/facebook/reflex/animation/Change;

    invoke-direct {v0}, Lcom/facebook/reflex/animation/Change;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/c/o;->g:Lcom/facebook/reflex/animation/Change;

    .line 85
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->g:Lcom/facebook/reflex/animation/Change;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/animation/Change;->a(Lcom/facebook/reflex/animation/PropertyName;)Lcom/facebook/reflex/animation/a;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/facebook/reflex/animation/a;->a(F)Lcom/facebook/reflex/animation/a;

    .line 87
    new-instance v0, Lcom/facebook/reflex/view/c/q;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/reflex/view/c/q;-><init>(Lcom/facebook/reflex/view/c/o;Lcom/facebook/reflex/view/c/p;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/c/o;->h:Lcom/facebook/reflex/view/c/q;

    .line 88
    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->a:Lcom/facebook/reflex/view/h;

    return-object v0
.end method

.method private a(Lcom/facebook/reflex/view/b/r;Z)V
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v0, p2}, Lcom/facebook/reflex/view/h;->setPressed(Z)V

    .line 167
    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/View;->setPressed(Z)V

    .line 168
    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/view/c/o;Lcom/facebook/reflex/view/b/r;Z)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1, p2}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/b/r;Z)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/view/c/o;Z)Z
    .locals 0

    .prologue
    .line 35
    iput-boolean p1, p0, Lcom/facebook/reflex/view/c/o;->m:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/reflex/view/c/o;)Z
    .locals 1

    .prologue
    .line 35
    iget-boolean v0, p0, Lcom/facebook/reflex/view/c/o;->l:Z

    return v0
.end method

.method static synthetic c(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/c/q;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->h:Lcom/facebook/reflex/view/c/q;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/reflex/view/c/o;)I
    .locals 1

    .prologue
    .line 35
    iget v0, p0, Lcom/facebook/reflex/view/c/o;->k:I

    return v0
.end method

.method static synthetic e(Lcom/facebook/reflex/view/c/o;)Z
    .locals 1

    .prologue
    .line 35
    iget-boolean v0, p0, Lcom/facebook/reflex/view/c/o;->m:Z

    return v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 103
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/o;->c(I)V

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/reflex/view/c/o;->m:Z

    .line 105
    return-void
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 91
    new-instance v0, Lcom/facebook/reflex/Color;

    invoke-direct {v0, p1}, Lcom/facebook/reflex/Color;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/reflex/view/c/o;->i:Lcom/facebook/reflex/Color;

    .line 92
    return-void
.end method

.method public a(Lcom/facebook/reflex/view/b/r;)V
    .locals 3

    .prologue
    .line 138
    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v1

    .line 139
    invoke-virtual {v1}, Lcom/facebook/reflex/Widget;->l()Lcom/facebook/reflex/ak;

    move-result-object v0

    if-nez v0, :cond_1

    .line 140
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/facebook/reflex/view/c/r;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/facebook/reflex/view/c/r;-><init>(Lcom/facebook/reflex/view/c/o;Lcom/facebook/reflex/view/c/p;)V

    .line 143
    :goto_0
    invoke-static {v0, p1}, Lcom/facebook/reflex/view/c/r;->a(Lcom/facebook/reflex/view/c/r;Lcom/facebook/reflex/view/b/r;)Lcom/facebook/reflex/view/b/r;

    .line 144
    invoke-virtual {v1, v0}, Lcom/facebook/reflex/Widget;->a(Lcom/facebook/reflex/ak;)V

    .line 145
    iget-boolean v2, p0, Lcom/facebook/reflex/view/c/o;->l:Z

    if-eqz v2, :cond_0

    .line 146
    invoke-virtual {v1, v0}, Lcom/facebook/reflex/Widget;->a(Lcom/facebook/reflex/w;)V

    .line 148
    :cond_0
    instance-of v0, p1, Lcom/facebook/reflex/view/b/h;

    if-eqz v0, :cond_1

    .line 149
    check-cast p1, Lcom/facebook/reflex/view/b/h;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/facebook/reflex/view/b/h;->setDispatchAndroidTouchEventsEnabled(Z)V

    .line 152
    :cond_1
    return-void

    .line 140
    :cond_2
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->b:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/facebook/reflex/view/c/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/c/r;

    goto :goto_0
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 99
    iput-boolean p1, p0, Lcom/facebook/reflex/view/c/o;->l:Z

    .line 100
    return-void
.end method

.method public b(I)V
    .locals 1

    .prologue
    .line 95
    new-instance v0, Lcom/facebook/reflex/Color;

    invoke-direct {v0, p1}, Lcom/facebook/reflex/Color;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/reflex/view/c/o;->j:Lcom/facebook/reflex/Color;

    .line 96
    return-void
.end method

.method public b(Lcom/facebook/reflex/view/b/r;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 155
    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/reflex/Widget;->l()Lcom/facebook/reflex/ak;

    move-result-object v0

    .line 156
    instance-of v1, v0, Lcom/facebook/reflex/view/c/r;

    if-eqz v1, :cond_0

    .line 157
    iget-object v1, p0, Lcom/facebook/reflex/view/c/o;->b:Ljava/util/ArrayList;

    check-cast v0, Lcom/facebook/reflex/view/c/r;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/reflex/Widget;->a(Lcom/facebook/reflex/ak;)V

    .line 159
    iget-boolean v0, p0, Lcom/facebook/reflex/view/c/o;->l:Z

    if-eqz v0, :cond_0

    .line 160
    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/reflex/Widget;->a(Lcom/facebook/reflex/w;)V

    .line 163
    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 5

    .prologue
    const/4 v2, 0x1

    .line 108
    iput p1, p0, Lcom/facebook/reflex/view/c/o;->k:I

    .line 109
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->c:Lcom/facebook/reflex/Widget;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Widget;->a(Lcom/facebook/reflex/d;)V

    .line 111
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->c:Lcom/facebook/reflex/Widget;

    invoke-virtual {v0, v2, v2}, Lcom/facebook/reflex/Widget;->a(II)V

    .line 119
    :goto_0
    invoke-virtual {p0, p1}, Lcom/facebook/reflex/view/c/o;->d(I)V

    .line 120
    return-void

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/h;->a(I)I

    move-result v0

    .line 114
    iget-object v1, p0, Lcom/facebook/reflex/view/c/o;->a:Lcom/facebook/reflex/view/h;

    add-int/lit8 v2, p1, 0x1

    invoke-virtual {v1, v2}, Lcom/facebook/reflex/view/h;->a(I)I

    move-result v1

    .line 115
    iget-object v2, p0, Lcom/facebook/reflex/view/c/o;->c:Lcom/facebook/reflex/Widget;

    const/4 v3, 0x0

    int-to-float v4, v0

    invoke-virtual {v2, v3, v4}, Lcom/facebook/reflex/Widget;->b(FF)V

    .line 116
    iget-object v2, p0, Lcom/facebook/reflex/view/c/o;->c:Lcom/facebook/reflex/Widget;

    iget-object v3, p0, Lcom/facebook/reflex/view/c/o;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v3}, Lcom/facebook/reflex/view/h;->getWidth()I

    move-result v3

    sub-int v0, v1, v0

    invoke-virtual {v2, v3, v0}, Lcom/facebook/reflex/Widget;->a(II)V

    .line 117
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->c:Lcom/facebook/reflex/Widget;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/o;->i:Lcom/facebook/reflex/Color;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Widget;->a(Lcom/facebook/reflex/d;)V

    goto :goto_0
.end method

.method public d(I)V
    .locals 5

    .prologue
    const/4 v2, 0x1

    .line 123
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/reflex/view/c/o;->l:Z

    if-nez v0, :cond_1

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->d:Lcom/facebook/reflex/Widget;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Widget;->a(Lcom/facebook/reflex/d;)V

    .line 125
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->d:Lcom/facebook/reflex/Widget;

    invoke-virtual {v0, v2, v2}, Lcom/facebook/reflex/Widget;->a(II)V

    .line 126
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->e:Lcom/facebook/reflex/animation/System;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/o;->g:Lcom/facebook/reflex/animation/Change;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/animation/System;->applyChange(Lcom/facebook/reflex/animation/Change;)V

    .line 135
    :goto_0
    return-void

    .line 128
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/h;->a(I)I

    move-result v0

    .line 129
    iget-object v1, p0, Lcom/facebook/reflex/view/c/o;->a:Lcom/facebook/reflex/view/h;

    add-int/lit8 v2, p1, 0x1

    invoke-virtual {v1, v2}, Lcom/facebook/reflex/view/h;->a(I)I

    move-result v1

    .line 130
    iget-object v2, p0, Lcom/facebook/reflex/view/c/o;->d:Lcom/facebook/reflex/Widget;

    const/4 v3, 0x0

    int-to-float v4, v0

    invoke-virtual {v2, v3, v4}, Lcom/facebook/reflex/Widget;->b(FF)V

    .line 131
    iget-object v2, p0, Lcom/facebook/reflex/view/c/o;->d:Lcom/facebook/reflex/Widget;

    iget-object v3, p0, Lcom/facebook/reflex/view/c/o;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v3}, Lcom/facebook/reflex/view/h;->getWidth()I

    move-result v3

    sub-int v0, v1, v0

    invoke-virtual {v2, v3, v0}, Lcom/facebook/reflex/Widget;->a(II)V

    .line 132
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->d:Lcom/facebook/reflex/Widget;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/o;->j:Lcom/facebook/reflex/Color;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Widget;->a(Lcom/facebook/reflex/d;)V

    .line 133
    iget-object v0, p0, Lcom/facebook/reflex/view/c/o;->e:Lcom/facebook/reflex/animation/System;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/o;->f:Lcom/facebook/reflex/animation/Change;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/animation/System;->applyChange(Lcom/facebook/reflex/animation/Change;)V

    goto :goto_0
.end method
