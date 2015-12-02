.class public Lcom/facebook/reflex/view/c/n;
.super Lcom/facebook/reflex/view/ContainerView;
.source "RefreshableListViewHeader.java"


# instance fields
.field private final a:Landroid/view/View;

.field private final c:Landroid/view/View;

.field private final d:Lcom/facebook/reflex/view/ContainerView;

.field private final e:Landroid/widget/TextView;

.field private final f:Landroid/widget/TextView;

.field private final g:Landroid/widget/TextView;

.field private final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lcom/facebook/reflex/animation/System;

.field private final j:Lcom/facebook/reflex/animation/Change;

.field private final k:Lcom/facebook/reflex/animation/Change;

.field private final l:Lcom/facebook/reflex/animation/Change;

.field private m:Lcom/facebook/reflex/view/c/m;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/reflex/view/c/n;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 45
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/reflex/view/c/n;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 46
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    .prologue
    const/high16 v5, 0x3f000000    # 0.5f

    const-wide v7, 0x41adcd6500000000L    # 2.5E8

    const/4 v6, 0x0

    .line 49
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/reflex/view/ContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    sget-object v0, Lcom/facebook/reflex/view/c/m;->Normal:Lcom/facebook/reflex/view/c/m;

    iput-object v0, p0, Lcom/facebook/reflex/view/c/n;->m:Lcom/facebook/reflex/view/c/m;

    .line 51
    invoke-virtual {p0}, Lcom/facebook/reflex/view/c/n;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 52
    sget v1, Lcom/facebook/k;->refreshable_list_view_header:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 54
    sget v0, Lcom/facebook/i;->pull_to_refresh_action_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/n;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/c/n;->a:Landroid/view/View;

    .line 55
    sget v0, Lcom/facebook/i;->pull_to_refresh_refresh_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/n;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/c/n;->c:Landroid/view/View;

    .line 57
    sget v0, Lcom/facebook/i;->pull_to_refresh_text_pull:I

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/n;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/reflex/view/c/n;->e:Landroid/widget/TextView;

    .line 58
    sget v0, Lcom/facebook/i;->pull_to_refresh_text_release:I

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/n;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/reflex/view/c/n;->f:Landroid/widget/TextView;

    .line 59
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/widget/TextView;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/reflex/view/c/n;->e:Landroid/widget/TextView;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/facebook/reflex/view/c/n;->f:Landroid/widget/TextView;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/c/n;->h:Ljava/util/List;

    .line 60
    sget v0, Lcom/facebook/i;->pull_to_refresh_last_loaded_time:I

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/n;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/reflex/view/c/n;->g:Landroid/widget/TextView;

    .line 62
    sget v0, Lcom/facebook/i;->pull_to_refresh_image_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/n;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/ContainerView;

    iput-object v0, p0, Lcom/facebook/reflex/view/c/n;->d:Lcom/facebook/reflex/view/ContainerView;

    .line 63
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->d:Lcom/facebook/reflex/view/ContainerView;

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/view/ContainerView;->setMinimumHeight(I)V

    .line 66
    new-instance v0, Lcom/facebook/reflex/animation/SystemConfig;

    invoke-direct {v0}, Lcom/facebook/reflex/animation/SystemConfig;-><init>()V

    .line 67
    new-instance v1, Lcom/facebook/reflex/animation/PropertyName;

    const-string v2, "arrow.rotation"

    invoke-direct {v1, v2}, Lcom/facebook/reflex/animation/PropertyName;-><init>(Ljava/lang/String;)V

    .line 68
    new-instance v2, Lcom/facebook/reflex/animation/PropertyName;

    const-string v3, "array.anchorX"

    invoke-direct {v2, v3}, Lcom/facebook/reflex/animation/PropertyName;-><init>(Ljava/lang/String;)V

    .line 69
    new-instance v3, Lcom/facebook/reflex/animation/PropertyName;

    const-string v4, "array.anchorY"

    invoke-direct {v3, v4}, Lcom/facebook/reflex/animation/PropertyName;-><init>(Ljava/lang/String;)V

    .line 71
    invoke-virtual {v0, v2, v5}, Lcom/facebook/reflex/animation/SystemConfig;->declareVariable(Lcom/facebook/reflex/animation/PropertyName;F)V

    .line 72
    invoke-virtual {v0, v3, v5}, Lcom/facebook/reflex/animation/SystemConfig;->declareVariable(Lcom/facebook/reflex/animation/PropertyName;F)V

    .line 73
    invoke-virtual {v0, v1, v6}, Lcom/facebook/reflex/animation/SystemConfig;->declareVariable(Lcom/facebook/reflex/animation/PropertyName;F)V

    .line 75
    const-string v4, "arrow"

    invoke-virtual {v0, v4}, Lcom/facebook/reflex/animation/SystemConfig;->declareWidget(Ljava/lang/String;)V

    .line 76
    const-string v4, "arrow"

    sget-object v5, Lcom/facebook/reflex/animation/b;->RotationZ:Lcom/facebook/reflex/animation/b;

    invoke-virtual {v0, v4, v5, v1}, Lcom/facebook/reflex/animation/SystemConfig;->a(Ljava/lang/String;Lcom/facebook/reflex/animation/b;Lcom/facebook/reflex/animation/PropertyName;)V

    .line 77
    const-string v4, "arrow"

    sget-object v5, Lcom/facebook/reflex/animation/b;->AnchorX:Lcom/facebook/reflex/animation/b;

    invoke-virtual {v0, v4, v5, v2}, Lcom/facebook/reflex/animation/SystemConfig;->a(Ljava/lang/String;Lcom/facebook/reflex/animation/b;Lcom/facebook/reflex/animation/PropertyName;)V

    .line 78
    const-string v2, "arrow"

    sget-object v4, Lcom/facebook/reflex/animation/b;->AnchorY:Lcom/facebook/reflex/animation/b;

    invoke-virtual {v0, v2, v4, v3}, Lcom/facebook/reflex/animation/SystemConfig;->a(Ljava/lang/String;Lcom/facebook/reflex/animation/b;Lcom/facebook/reflex/animation/PropertyName;)V

    .line 80
    new-instance v2, Lcom/facebook/reflex/animation/System;

    invoke-direct {v2, v0}, Lcom/facebook/reflex/animation/System;-><init>(Lcom/facebook/reflex/animation/SystemConfig;)V

    iput-object v2, p0, Lcom/facebook/reflex/view/c/n;->i:Lcom/facebook/reflex/animation/System;

    .line 81
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->i:Lcom/facebook/reflex/animation/System;

    const-string v2, "arrow"

    iget-object v3, p0, Lcom/facebook/reflex/view/c/n;->d:Lcom/facebook/reflex/view/ContainerView;

    invoke-virtual {v3}, Lcom/facebook/reflex/view/ContainerView;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/facebook/reflex/animation/System;->bindWidget(Ljava/lang/String;Lcom/facebook/reflex/Widget;)V

    .line 83
    new-instance v0, Lcom/facebook/reflex/animation/Change;

    invoke-direct {v0}, Lcom/facebook/reflex/animation/Change;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/c/n;->j:Lcom/facebook/reflex/animation/Change;

    .line 84
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->j:Lcom/facebook/reflex/animation/Change;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/animation/Change;->a(Lcom/facebook/reflex/animation/PropertyName;)Lcom/facebook/reflex/animation/a;

    move-result-object v0

    const/high16 v2, -0x3ccc0000    # -180.0f

    invoke-virtual {v0, v2}, Lcom/facebook/reflex/animation/a;->a(F)Lcom/facebook/reflex/animation/a;

    move-result-object v0

    invoke-static {v7, v8}, Lcom/facebook/reflex/animation/Transition;->a(D)Lcom/facebook/reflex/animation/Transition;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/reflex/animation/a;->a(Lcom/facebook/reflex/animation/Transition;)Lcom/facebook/reflex/animation/a;

    .line 86
    new-instance v0, Lcom/facebook/reflex/animation/Change;

    invoke-direct {v0}, Lcom/facebook/reflex/animation/Change;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/c/n;->k:Lcom/facebook/reflex/animation/Change;

    .line 87
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->k:Lcom/facebook/reflex/animation/Change;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/animation/Change;->a(Lcom/facebook/reflex/animation/PropertyName;)Lcom/facebook/reflex/animation/a;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/facebook/reflex/animation/a;->a(F)Lcom/facebook/reflex/animation/a;

    move-result-object v0

    invoke-static {v7, v8}, Lcom/facebook/reflex/animation/Transition;->a(D)Lcom/facebook/reflex/animation/Transition;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/reflex/animation/a;->a(Lcom/facebook/reflex/animation/Transition;)Lcom/facebook/reflex/animation/a;

    .line 89
    new-instance v0, Lcom/facebook/reflex/animation/Change;

    invoke-direct {v0}, Lcom/facebook/reflex/animation/Change;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/c/n;->l:Lcom/facebook/reflex/animation/Change;

    .line 90
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->l:Lcom/facebook/reflex/animation/Change;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/animation/Change;->a(Lcom/facebook/reflex/animation/PropertyName;)Lcom/facebook/reflex/animation/a;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/facebook/reflex/animation/a;->a(F)Lcom/facebook/reflex/animation/a;

    .line 91
    return-void
.end method

.method private a(Landroid/widget/TextView;)V
    .locals 3

    .prologue
    .line 154
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 155
    if-ne v0, p1, :cond_0

    .line 156
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 158
    :cond_0
    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 161
    :cond_1
    return-void
.end method


# virtual methods
.method public getState()Lcom/facebook/reflex/view/c/m;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->m:Lcom/facebook/reflex/view/c/m;

    return-object v0
.end method

.method public setLastLoadedTime(J)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 94
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    .line 95
    invoke-virtual {p0}, Lcom/facebook/reflex/view/c/n;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 96
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 97
    invoke-static {v0}, Landroid/text/format/DateFormat;->getDateFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    .line 98
    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 99
    sget v3, Lcom/facebook/o;->pull_to_refresh_last_updated_date:I

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v1, v4, v2

    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 103
    iget-object v1, p0, Lcom/facebook/reflex/view/c/n;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 108
    :goto_0
    return-void

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method public setState(Lcom/facebook/reflex/view/c/m;)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 115
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->m:Lcom/facebook/reflex/view/c/m;

    if-ne p1, v0, :cond_0

    .line 151
    :goto_0
    return-void

    .line 120
    :cond_0
    sget-object v0, Lcom/facebook/reflex/view/c/m;->Loading:Lcom/facebook/reflex/view/c/m;

    if-ne p1, v0, :cond_2

    .line 121
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->a:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 122
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->a()Lcom/facebook/reflex/Container;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/reflex/view/c/n;->d:Lcom/facebook/reflex/view/ContainerView;

    invoke-virtual {v1}, Lcom/facebook/reflex/view/ContainerView;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Container;->b(Lcom/facebook/reflex/Widget;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 123
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->a()Lcom/facebook/reflex/Container;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/reflex/view/c/n;->d:Lcom/facebook/reflex/view/ContainerView;

    invoke-virtual {v1}, Lcom/facebook/reflex/view/ContainerView;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Container;->c(Lcom/facebook/reflex/Widget;)V

    .line 125
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->c:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 135
    :goto_1
    sget-object v0, Lcom/facebook/reflex/view/c/m;->ReleaseToRefresh:Lcom/facebook/reflex/view/c/m;

    if-ne p1, v0, :cond_4

    .line 136
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->f:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/c/n;->a(Landroid/widget/TextView;)V

    .line 141
    :goto_2
    invoke-virtual {p0}, Lcom/facebook/reflex/view/c/n;->e()V

    .line 144
    sget-object v0, Lcom/facebook/reflex/view/c/m;->ReleaseToRefresh:Lcom/facebook/reflex/view/c/m;

    if-ne p1, v0, :cond_5

    .line 145
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->i:Lcom/facebook/reflex/animation/System;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/n;->j:Lcom/facebook/reflex/animation/Change;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/animation/System;->applyChange(Lcom/facebook/reflex/animation/Change;)V

    .line 150
    :goto_3
    iput-object p1, p0, Lcom/facebook/reflex/view/c/n;->m:Lcom/facebook/reflex/view/c/m;

    goto :goto_0

    .line 127
    :cond_2
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->a:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 128
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->a()Lcom/facebook/reflex/Container;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/reflex/view/c/n;->d:Lcom/facebook/reflex/view/ContainerView;

    invoke-virtual {v1}, Lcom/facebook/reflex/view/ContainerView;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Container;->b(Lcom/facebook/reflex/Widget;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 129
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->a()Lcom/facebook/reflex/Container;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/reflex/view/c/n;->d:Lcom/facebook/reflex/view/ContainerView;

    invoke-virtual {v1}, Lcom/facebook/reflex/view/ContainerView;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/Widget;)V

    .line 131
    :cond_3
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->c:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 138
    :cond_4
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->e:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/c/n;->a(Landroid/widget/TextView;)V

    goto :goto_2

    .line 147
    :cond_5
    iget-object v0, p0, Lcom/facebook/reflex/view/c/n;->i:Lcom/facebook/reflex/animation/System;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/n;->k:Lcom/facebook/reflex/animation/Change;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/animation/System;->applyChange(Lcom/facebook/reflex/animation/Change;)V

    goto :goto_3
.end method
