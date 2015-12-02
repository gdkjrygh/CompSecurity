.class Landroid/support/v7/app/h;
.super Landroid/support/v7/app/ActionBar;
.source "360Security"


# instance fields
.field final a:Landroid/os/Handler;

.field private b:Landroid/content/Context;

.field private c:Landroid/content/Context;

.field private d:Landroid/support/v7/app/ActionBarActivity;

.field private e:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

.field private f:Landroid/support/v7/internal/widget/ActionBarContainer;

.field private g:Landroid/view/ViewGroup;

.field private h:Landroid/support/v7/internal/widget/ActionBarView;

.field private i:Landroid/support/v7/internal/widget/ActionBarContextView;

.field private j:Landroid/support/v7/internal/widget/ActionBarContainer;

.field private k:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/app/ActionBarImplBase$TabImpl;",
            ">;"
        }
    .end annotation
.end field

.field private m:I

.field private n:Z

.field private o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;",
            ">;"
        }
    .end annotation
.end field

.field private p:I

.field private q:Z

.field private r:I

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Landroid/support/v7/app/ActionBar$a;


# direct methods
.method public constructor <init>(Landroid/support/v7/app/ActionBarActivity;Landroid/support/v7/app/ActionBar$a;)V
    .locals 1

    .prologue
    .line 106
    invoke-direct {p0}, Landroid/support/v7/app/ActionBar;-><init>()V

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/app/h;->l:Ljava/util/ArrayList;

    .line 72
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/app/h;->m:I

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/app/h;->o:Ljava/util/ArrayList;

    .line 92
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroid/support/v7/app/h;->a:Landroid/os/Handler;

    .line 95
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/app/h;->r:I

    .line 101
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/h;->v:Z

    .line 107
    iput-object p1, p0, Landroid/support/v7/app/h;->d:Landroid/support/v7/app/ActionBarActivity;

    .line 108
    iput-object p1, p0, Landroid/support/v7/app/h;->b:Landroid/content/Context;

    .line 109
    iput-object p2, p0, Landroid/support/v7/app/h;->x:Landroid/support/v7/app/ActionBar$a;

    .line 110
    iget-object v0, p0, Landroid/support/v7/app/h;->d:Landroid/support/v7/app/ActionBarActivity;

    invoke-direct {p0, v0}, Landroid/support/v7/app/h;->a(Landroid/support/v7/app/ActionBarActivity;)V

    .line 111
    return-void
.end method

.method private a(Landroid/support/v7/app/ActionBarActivity;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 114
    sget v0, Landroid/support/v7/a/a$e;->action_bar_overlay_layout:I

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    iput-object v0, p0, Landroid/support/v7/app/h;->e:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    .line 116
    iget-object v0, p0, Landroid/support/v7/app/h;->e:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Landroid/support/v7/app/h;->e:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    invoke-virtual {v0, p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->setActionBar(Landroid/support/v7/app/ActionBar;)V

    .line 119
    :cond_0
    sget v0, Landroid/support/v7/a/a$e;->action_bar:I

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActionBarView;

    iput-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    .line 120
    sget v0, Landroid/support/v7/a/a$e;->action_context_bar:I

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActionBarContextView;

    iput-object v0, p0, Landroid/support/v7/app/h;->i:Landroid/support/v7/internal/widget/ActionBarContextView;

    .line 121
    sget v0, Landroid/support/v7/a/a$e;->action_bar_container:I

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActionBarContainer;

    iput-object v0, p0, Landroid/support/v7/app/h;->f:Landroid/support/v7/internal/widget/ActionBarContainer;

    .line 122
    sget v0, Landroid/support/v7/a/a$e;->top_action_bar:I

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Landroid/support/v7/app/h;->g:Landroid/view/ViewGroup;

    .line 123
    iget-object v0, p0, Landroid/support/v7/app/h;->g:Landroid/view/ViewGroup;

    if-nez v0, :cond_1

    .line 124
    iget-object v0, p0, Landroid/support/v7/app/h;->f:Landroid/support/v7/internal/widget/ActionBarContainer;

    iput-object v0, p0, Landroid/support/v7/app/h;->g:Landroid/view/ViewGroup;

    .line 126
    :cond_1
    sget v0, Landroid/support/v7/a/a$e;->split_action_bar:I

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActionBarContainer;

    iput-object v0, p0, Landroid/support/v7/app/h;->j:Landroid/support/v7/internal/widget/ActionBarContainer;

    .line 128
    iget-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/app/h;->i:Landroid/support/v7/internal/widget/ActionBarContextView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/app/h;->f:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-nez v0, :cond_3

    .line 129
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " can only be used "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "with a compatible window decor layout"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 133
    :cond_3
    iget-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v3, p0, Landroid/support/v7/app/h;->i:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ActionBarView;->setContextView(Landroid/support/v7/internal/widget/ActionBarContextView;)V

    .line 134
    iget-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->isSplitActionBar()Z

    move-result v0

    if-eqz v0, :cond_7

    move v0, v1

    :goto_0
    iput v0, p0, Landroid/support/v7/app/h;->p:I

    .line 138
    iget-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getDisplayOptions()I

    move-result v0

    .line 139
    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_8

    move v0, v1

    .line 140
    :goto_1
    if-eqz v0, :cond_4

    .line 141
    iput-boolean v1, p0, Landroid/support/v7/app/h;->n:Z

    .line 144
    :cond_4
    iget-object v3, p0, Landroid/support/v7/app/h;->b:Landroid/content/Context;

    invoke-static {v3}, Landroid/support/v7/internal/view/ActionBarPolicy;->get(Landroid/content/Context;)Landroid/support/v7/internal/view/ActionBarPolicy;

    move-result-object v3

    .line 145
    invoke-virtual {v3}, Landroid/support/v7/internal/view/ActionBarPolicy;->enableHomeButtonByDefault()Z

    move-result v4

    if-nez v4, :cond_5

    if-eqz v0, :cond_6

    :cond_5
    move v2, v1

    :cond_6
    invoke-virtual {p0, v2}, Landroid/support/v7/app/h;->f(Z)V

    .line 146
    invoke-virtual {v3}, Landroid/support/v7/internal/view/ActionBarPolicy;->hasEmbeddedTabs()Z

    move-result v0

    invoke-direct {p0, v0}, Landroid/support/v7/app/h;->j(Z)V

    .line 147
    iget-object v0, p0, Landroid/support/v7/app/h;->d:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarActivity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/app/h;->a(Ljava/lang/CharSequence;)V

    .line 148
    return-void

    :cond_7
    move v0, v2

    .line 134
    goto :goto_0

    :cond_8
    move v0, v2

    .line 139
    goto :goto_1
.end method

.method private static a(ZZZ)Z
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 969
    if-eqz p2, :cond_1

    .line 974
    :cond_0
    :goto_0
    return v0

    .line 971
    :cond_1
    if-nez p0, :cond_2

    if-eqz p1, :cond_0

    .line 972
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private j(Z)V
    .locals 5

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 155
    iput-boolean p1, p0, Landroid/support/v7/app/h;->q:Z

    .line 157
    iget-boolean v0, p0, Landroid/support/v7/app/h;->q:Z

    if-nez v0, :cond_1

    .line 158
    iget-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ActionBarView;->setEmbeddedTabView(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V

    .line 159
    iget-object v0, p0, Landroid/support/v7/app/h;->f:Landroid/support/v7/internal/widget/ActionBarContainer;

    iget-object v3, p0, Landroid/support/v7/app/h;->k:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ActionBarContainer;->setTabContainer(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V

    .line 164
    :goto_0
    invoke-virtual {p0}, Landroid/support/v7/app/h;->e()I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_2

    move v0, v1

    .line 165
    :goto_1
    iget-object v3, p0, Landroid/support/v7/app/h;->k:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    if-eqz v3, :cond_0

    .line 166
    if-eqz v0, :cond_3

    .line 167
    iget-object v3, p0, Landroid/support/v7/app/h;->k:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v3, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    .line 172
    :cond_0
    :goto_2
    iget-object v3, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    iget-boolean v4, p0, Landroid/support/v7/app/h;->q:Z

    if-nez v4, :cond_4

    if-eqz v0, :cond_4

    :goto_3
    invoke-virtual {v3, v1}, Landroid/support/v7/internal/widget/ActionBarView;->setCollapsable(Z)V

    .line 173
    return-void

    .line 161
    :cond_1
    iget-object v0, p0, Landroid/support/v7/app/h;->f:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ActionBarContainer;->setTabContainer(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V

    .line 162
    iget-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v3, p0, Landroid/support/v7/app/h;->k:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ActionBarView;->setEmbeddedTabView(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V

    goto :goto_0

    :cond_2
    move v0, v2

    .line 164
    goto :goto_1

    .line 169
    :cond_3
    iget-object v3, p0, Landroid/support/v7/app/h;->k:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    goto :goto_2

    :cond_4
    move v1, v2

    .line 172
    goto :goto_3
.end method

.method private k(Z)V
    .locals 3

    .prologue
    .line 980
    iget-boolean v0, p0, Landroid/support/v7/app/h;->s:Z

    iget-boolean v1, p0, Landroid/support/v7/app/h;->t:Z

    iget-boolean v2, p0, Landroid/support/v7/app/h;->u:Z

    invoke-static {v0, v1, v2}, Landroid/support/v7/app/h;->a(ZZZ)Z

    move-result v0

    .line 982
    if-eqz v0, :cond_1

    .line 983
    iget-boolean v0, p0, Landroid/support/v7/app/h;->v:Z

    if-nez v0, :cond_0

    .line 984
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/h;->v:Z

    .line 985
    invoke-virtual {p0, p1}, Landroid/support/v7/app/h;->h(Z)V

    .line 993
    :cond_0
    :goto_0
    return-void

    .line 988
    :cond_1
    iget-boolean v0, p0, Landroid/support/v7/app/h;->v:Z

    if-eqz v0, :cond_0

    .line 989
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/app/h;->v:Z

    .line 990
    invoke-virtual {p0, p1}, Landroid/support/v7/app/h;->i(Z)V

    goto :goto_0
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 1

    .prologue
    .line 347
    iget-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getCustomNavigationView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(I)V
    .locals 3

    .prologue
    .line 193
    invoke-virtual {p0}, Landroid/support/v7/app/h;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/app/h;->a(Landroid/view/View;)V

    .line 195
    return-void
.end method

.method public a(II)V
    .locals 4

    .prologue
    .line 293
    iget-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getDisplayOptions()I

    move-result v0

    .line 294
    and-int/lit8 v1, p2, 0x4

    if-eqz v1, :cond_0

    .line 295
    const/4 v1, 0x1

    iput-boolean v1, p0, Landroid/support/v7/app/h;->n:Z

    .line 297
    :cond_0
    iget-object v1, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    and-int v2, p1, p2

    xor-int/lit8 v3, p2, -0x1

    and-int/2addr v0, v3

    or-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ActionBarView;->setDisplayOptions(I)V

    .line 298
    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 151
    iget-object v0, p0, Landroid/support/v7/app/h;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->get(Landroid/content/Context;)Landroid/support/v7/internal/view/ActionBarPolicy;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->hasEmbeddedTabs()Z

    move-result v0

    invoke-direct {p0, v0}, Landroid/support/v7/app/h;->j(Z)V

    .line 152
    return-void
.end method

.method public a(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 332
    iget-object v0, p0, Landroid/support/v7/app/h;->f:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarContainer;->setPrimaryBackground(Landroid/graphics/drawable/Drawable;)V

    .line 333
    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setCustomNavigationView(Landroid/view/View;)V

    .line 182
    return-void
.end method

.method public a(Landroid/view/View;Landroid/support/v7/app/ActionBar$LayoutParams;)V
    .locals 1

    .prologue
    .line 186
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 187
    iget-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setCustomNavigationView(Landroid/view/View;)V

    .line 189
    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 265
    iget-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setTitle(Ljava/lang/CharSequence;)V

    .line 266
    return-void
.end method

.method public a(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 302
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/h;->a(II)V

    .line 303
    return-void

    .line 302
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 352
    iget-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public b(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x2

    .line 307
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/h;->a(II)V

    .line 308
    return-void

    .line 307
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 391
    iget-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getDisplayOptions()I

    move-result v0

    return v0
.end method

.method public c(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 312
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/h;->a(II)V

    .line 313
    return-void

    .line 312
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Landroid/content/Context;
    .locals 4

    .prologue
    .line 512
    iget-object v0, p0, Landroid/support/v7/app/h;->c:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 513
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 514
    iget-object v1, p0, Landroid/support/v7/app/h;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    .line 515
    sget v2, Landroid/support/v7/a/a$b;->actionBarWidgetTheme:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 516
    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    .line 518
    if-eqz v0, :cond_1

    .line 519
    new-instance v1, Landroid/view/ContextThemeWrapper;

    iget-object v2, p0, Landroid/support/v7/app/h;->b:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Landroid/support/v7/app/h;->c:Landroid/content/Context;

    .line 524
    :cond_0
    :goto_0
    iget-object v0, p0, Landroid/support/v7/app/h;->c:Landroid/content/Context;

    return-object v0

    .line 521
    :cond_1
    iget-object v0, p0, Landroid/support/v7/app/h;->b:Landroid/content/Context;

    iput-object v0, p0, Landroid/support/v7/app/h;->c:Landroid/content/Context;

    goto :goto_0
.end method

.method public d(Z)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 317
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/h;->a(II)V

    .line 318
    return-void

    .line 317
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 362
    iget-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getNavigationMode()I

    move-result v0

    return v0
.end method

.method public e(Z)V
    .locals 2

    .prologue
    const/16 v1, 0x10

    .line 322
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/h;->a(II)V

    .line 323
    return-void

    .line 322
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method f()V
    .locals 1

    .prologue
    .line 551
    iget-boolean v0, p0, Landroid/support/v7/app/h;->u:Z

    if-nez v0, :cond_0

    .line 552
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/h;->u:Z

    .line 553
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/app/h;->k(Z)V

    .line 555
    :cond_0
    return-void
.end method

.method public f(Z)V
    .locals 1

    .prologue
    .line 327
    iget-object v0, p0, Landroid/support/v7/app/h;->h:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setHomeButtonEnabled(Z)V

    .line 328
    return-void
.end method

.method g()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 566
    iget-boolean v0, p0, Landroid/support/v7/app/h;->u:Z

    if-eqz v0, :cond_0

    .line 567
    iput-boolean v1, p0, Landroid/support/v7/app/h;->u:Z

    .line 568
    invoke-direct {p0, v1}, Landroid/support/v7/app/h;->k(Z)V

    .line 570
    :cond_0
    return-void
.end method

.method public g(Z)V
    .locals 1

    .prologue
    .line 996
    iput-boolean p1, p0, Landroid/support/v7/app/h;->w:Z

    .line 997
    if-nez p1, :cond_0

    .line 998
    iget-object v0, p0, Landroid/support/v7/app/h;->g:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->clearAnimation()V

    .line 999
    iget-object v0, p0, Landroid/support/v7/app/h;->j:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v0, :cond_0

    .line 1000
    iget-object v0, p0, Landroid/support/v7/app/h;->j:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->clearAnimation()V

    .line 1003
    :cond_0
    return-void
.end method

.method public h(Z)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 1006
    iget-object v0, p0, Landroid/support/v7/app/h;->g:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->clearAnimation()V

    .line 1007
    iget-object v0, p0, Landroid/support/v7/app/h;->g:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 1026
    :cond_0
    :goto_0
    return-void

    .line 1011
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/app/h;->h()Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p1, :cond_5

    :cond_2
    const/4 v0, 0x1

    .line 1013
    :goto_1
    if-eqz v0, :cond_3

    .line 1014
    iget-object v2, p0, Landroid/support/v7/app/h;->b:Landroid/content/Context;

    sget v3, Landroid/support/v7/a/a$a;->abc_slide_in_top:I

    invoke-static {v2, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v2

    .line 1015
    iget-object v3, p0, Landroid/support/v7/app/h;->g:Landroid/view/ViewGroup;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1017
    :cond_3
    iget-object v2, p0, Landroid/support/v7/app/h;->g:Landroid/view/ViewGroup;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 1019
    iget-object v2, p0, Landroid/support/v7/app/h;->j:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/app/h;->j:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->getVisibility()I

    move-result v2

    if-eqz v2, :cond_0

    .line 1020
    if-eqz v0, :cond_4

    .line 1021
    iget-object v0, p0, Landroid/support/v7/app/h;->b:Landroid/content/Context;

    sget v2, Landroid/support/v7/a/a$a;->abc_slide_in_bottom:I

    invoke-static {v0, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1022
    iget-object v2, p0, Landroid/support/v7/app/h;->j:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v2, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1024
    :cond_4
    iget-object v0, p0, Landroid/support/v7/app/h;->j:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V

    goto :goto_0

    :cond_5
    move v0, v1

    .line 1011
    goto :goto_1
.end method

.method h()Z
    .locals 1

    .prologue
    .line 1053
    iget-boolean v0, p0, Landroid/support/v7/app/h;->w:Z

    return v0
.end method

.method public i(Z)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    .line 1029
    iget-object v0, p0, Landroid/support/v7/app/h;->g:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->clearAnimation()V

    .line 1030
    iget-object v0, p0, Landroid/support/v7/app/h;->g:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-ne v0, v3, :cond_1

    .line 1050
    :cond_0
    :goto_0
    return-void

    .line 1034
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/app/h;->h()Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p1, :cond_5

    :cond_2
    const/4 v0, 0x1

    .line 1036
    :goto_1
    if-eqz v0, :cond_3

    .line 1037
    iget-object v1, p0, Landroid/support/v7/app/h;->b:Landroid/content/Context;

    sget v2, Landroid/support/v7/a/a$a;->abc_slide_out_top:I

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    .line 1038
    iget-object v2, p0, Landroid/support/v7/app/h;->g:Landroid/view/ViewGroup;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1040
    :cond_3
    iget-object v1, p0, Landroid/support/v7/app/h;->g:Landroid/view/ViewGroup;

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 1042
    iget-object v1, p0, Landroid/support/v7/app/h;->j:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/app/h;->j:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->getVisibility()I

    move-result v1

    if-eq v1, v3, :cond_0

    .line 1043
    if-eqz v0, :cond_4

    .line 1044
    iget-object v0, p0, Landroid/support/v7/app/h;->b:Landroid/content/Context;

    sget v1, Landroid/support/v7/a/a$a;->abc_slide_out_bottom:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1046
    iget-object v1, p0, Landroid/support/v7/app/h;->j:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1048
    :cond_4
    iget-object v0, p0, Landroid/support/v7/app/h;->j:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V

    goto :goto_0

    .line 1034
    :cond_5
    const/4 v0, 0x0

    goto :goto_1
.end method
