.class public final Lcom/roidapp/cloudlib/template/b/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Long;",
            "Lcom/roidapp/cloudlib/template/b/j;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/roidapp/cloudlib/template/b/j;

.field private c:Lcom/roidapp/cloudlib/template/b/j;

.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/template/b/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/template/b/c;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/b/k;->d:Ljava/lang/ref/WeakReference;

    .line 34
    iput-object p2, p0, Lcom/roidapp/cloudlib/template/b/k;->e:Ljava/lang/ref/WeakReference;

    .line 35
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    .line 36
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .prologue
    .line 58
    new-instance v0, Lcom/roidapp/cloudlib/template/b/e;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->d:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/b/k;->e:Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/template/b/e;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    .line 59
    new-instance v0, Lcom/roidapp/cloudlib/template/b/d;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/b/d;-><init>()V

    .line 60
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/template/b/d;->f:Z

    .line 61
    iput p1, v0, Lcom/roidapp/cloudlib/template/b/d;->h:I

    .line 62
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b/j;->a(Lcom/roidapp/cloudlib/template/b/l;)V

    .line 63
    return-void
.end method

.method public final a(J)V
    .locals 3

    .prologue
    .line 174
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    :cond_0
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 4

    .prologue
    .line 98
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 99
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 100
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/cloudlib/template/b/j;

    .line 101
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/template/b/j;->isCancelled()Z

    move-result v1

    if-nez v1, :cond_1

    .line 102
    if-eqz v0, :cond_0

    .line 103
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->d:Ljava/lang/ref/WeakReference;

    sget v2, Lcom/roidapp/cloudlib/at;->aU:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 116
    :cond_0
    :goto_0
    return-void

    .line 108
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    :cond_2
    new-instance v0, Lcom/roidapp/cloudlib/template/b/h;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->d:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/b/k;->e:Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/template/b/h;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->c:Lcom/roidapp/cloudlib/template/b/j;

    .line 112
    new-instance v0, Lcom/roidapp/cloudlib/template/b/g;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/b/g;-><init>()V

    .line 113
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/template/b/g;->b:Z

    .line 114
    iput-object p1, v0, Lcom/roidapp/cloudlib/template/b/g;->d:Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 115
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->c:Lcom/roidapp/cloudlib/template/b/j;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b/j;->a(Lcom/roidapp/cloudlib/template/b/l;)V

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()V
    .locals 3

    .prologue
    .line 43
    new-instance v0, Lcom/roidapp/cloudlib/template/b/e;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->d:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/b/k;->e:Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/template/b/e;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    .line 44
    new-instance v0, Lcom/roidapp/cloudlib/template/b/d;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/b/d;-><init>()V

    .line 45
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/template/b/d;->a:Z

    .line 46
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b/j;->a(Lcom/roidapp/cloudlib/template/b/l;)V

    .line 47
    return-void
.end method

.method public final b(I)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 81
    new-instance v0, Lcom/roidapp/cloudlib/template/b/e;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->d:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/b/k;->e:Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/template/b/e;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    .line 82
    new-instance v0, Lcom/roidapp/cloudlib/template/b/d;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/b/d;-><init>()V

    .line 83
    iput-boolean v3, v0, Lcom/roidapp/cloudlib/template/b/d;->f:Z

    .line 84
    iput-boolean v3, v0, Lcom/roidapp/cloudlib/template/b/d;->g:Z

    .line 85
    iput p1, v0, Lcom/roidapp/cloudlib/template/b/d;->h:I

    .line 86
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b/j;->a(Lcom/roidapp/cloudlib/template/b/l;)V

    .line 87
    return-void
.end method

.method public final b(Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 124
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 125
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/b/j;

    .line 126
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/j;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 127
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 128
    if-eqz v0, :cond_0

    .line 129
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->d:Ljava/lang/ref/WeakReference;

    sget v2, Lcom/roidapp/cloudlib/at;->aU:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 159
    :cond_0
    :goto_0
    return-void

    .line 134
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    :cond_2
    new-instance v0, Lcom/roidapp/cloudlib/template/b/h;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->d:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/b/k;->e:Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/template/b/h;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->c:Lcom/roidapp/cloudlib/template/b/j;

    .line 138
    new-instance v2, Lcom/roidapp/cloudlib/template/b/g;

    invoke-direct {v2}, Lcom/roidapp/cloudlib/template/b/g;-><init>()V

    .line 139
    iput-boolean v7, v2, Lcom/roidapp/cloudlib/template/b/g;->c:Z

    .line 140
    iput-object p1, v2, Lcom/roidapp/cloudlib/template/b/g;->d:Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 141
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->c()Landroid/widget/ProgressBar;

    move-result-object v3

    .line 142
    if-eqz v3, :cond_3

    .line 143
    invoke-virtual {v3}, Landroid/widget/ProgressBar;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 144
    new-instance v1, Landroid/view/animation/AlphaAnimation;

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v1, v4, v5}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 145
    const-wide/16 v4, 0xc8

    invoke-virtual {v1, v4, v5}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 146
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 148
    sget v1, Lcom/roidapp/cloudlib/ar;->cC:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 149
    sget v4, Lcom/roidapp/cloudlib/aq;->r:I

    invoke-virtual {v1, v4, v6, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 150
    const-string v4, ""

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    invoke-virtual {v3, v7}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 152
    invoke-virtual {p1, v7}, Lcom/roidapp/cloudlib/template/TemplateInfo;->a(I)V

    .line 154
    invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 156
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->c:Lcom/roidapp/cloudlib/template/b/j;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/template/b/j;->a(Lcom/roidapp/cloudlib/template/b/l;)V

    .line 157
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/b/k;->c:Lcom/roidapp/cloudlib/template/b/j;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 51
    new-instance v0, Lcom/roidapp/cloudlib/template/b/e;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->d:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/b/k;->e:Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/template/b/e;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    .line 52
    new-instance v0, Lcom/roidapp/cloudlib/template/b/d;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/b/d;-><init>()V

    .line 53
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/template/b/d;->b:Z

    .line 54
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b/j;->a(Lcom/roidapp/cloudlib/template/b/l;)V

    .line 55
    return-void
.end method

.method public final c(Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 3

    .prologue
    .line 166
    new-instance v0, Lcom/roidapp/cloudlib/template/b/h;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->d:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/b/k;->e:Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/template/b/h;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->c:Lcom/roidapp/cloudlib/template/b/j;

    .line 167
    new-instance v0, Lcom/roidapp/cloudlib/template/b/g;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/b/g;-><init>()V

    .line 168
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/template/b/g;->a:Z

    .line 169
    iput-object p1, v0, Lcom/roidapp/cloudlib/template/b/g;->d:Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 170
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->c:Lcom/roidapp/cloudlib/template/b/j;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b/j;->a(Lcom/roidapp/cloudlib/template/b/l;)V

    .line 171
    return-void
.end method

.method public final d()V
    .locals 3

    .prologue
    .line 66
    new-instance v0, Lcom/roidapp/cloudlib/template/b/e;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->d:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/b/k;->e:Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/template/b/e;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    .line 67
    new-instance v0, Lcom/roidapp/cloudlib/template/b/d;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/b/d;-><init>()V

    .line 68
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/template/b/d;->c:Z

    .line 69
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b/j;->a(Lcom/roidapp/cloudlib/template/b/l;)V

    .line 70
    return-void
.end method

.method public final e()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 73
    new-instance v0, Lcom/roidapp/cloudlib/template/b/e;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->d:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/b/k;->e:Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/template/b/e;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    .line 74
    new-instance v0, Lcom/roidapp/cloudlib/template/b/d;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/b/d;-><init>()V

    .line 75
    iput-boolean v3, v0, Lcom/roidapp/cloudlib/template/b/d;->e:Z

    .line 76
    iput-boolean v3, v0, Lcom/roidapp/cloudlib/template/b/d;->b:Z

    .line 77
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b/j;->a(Lcom/roidapp/cloudlib/template/b/l;)V

    .line 78
    return-void
.end method

.method public final f()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 90
    new-instance v0, Lcom/roidapp/cloudlib/template/b/e;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->d:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/b/k;->e:Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/template/b/e;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    .line 91
    new-instance v0, Lcom/roidapp/cloudlib/template/b/d;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/b/d;-><init>()V

    .line 92
    iput-boolean v3, v0, Lcom/roidapp/cloudlib/template/b/d;->d:Z

    .line 93
    iput-boolean v3, v0, Lcom/roidapp/cloudlib/template/b/d;->c:Z

    .line 94
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b/j;->a(Lcom/roidapp/cloudlib/template/b/l;)V

    .line 95
    return-void
.end method

.method public final g()V
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/j;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 184
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/j;->a()V

    .line 185
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->b:Lcom/roidapp/cloudlib/template/b/j;

    .line 187
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 3

    .prologue
    .line 193
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    if-eqz v0, :cond_2

    .line 194
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 195
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/b/j;

    .line 196
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/j;->isCancelled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 197
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/j;->a()V

    goto :goto_0

    .line 200
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 201
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/k;->a:Ljava/util/Map;

    .line 203
    :cond_2
    return-void
.end method
