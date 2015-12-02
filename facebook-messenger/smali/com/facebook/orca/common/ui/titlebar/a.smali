.class public Lcom/facebook/orca/common/ui/titlebar/a;
.super Ljava/lang/Object;
.source "DivebarController.java"

# interfaces
.implements Lcom/facebook/ui/touch/d;


# static fields
.field private static final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private A:Lcom/facebook/orca/common/ui/titlebar/n;

.field private B:Lcom/facebook/ui/touch/a;

.field private C:Lcom/facebook/ui/touch/a;

.field private D:Lcom/a/a/ak;

.field private E:Z

.field private F:Z

.field private G:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/contacts/divebar/bl;",
            ">;"
        }
    .end annotation
.end field

.field private H:Lcom/facebook/orca/common/ui/titlebar/p;

.field private I:Lcom/facebook/orca/common/ui/a/a;

.field a:Landroid/view/View;

.field b:Landroid/view/ViewGroup;

.field private d:Landroid/app/Activity;

.field private final e:Landroid/view/inputmethod/InputMethodManager;

.field private final f:Lcom/facebook/analytics/av;

.field private final g:Lcom/facebook/orca/f/k;

.field private final h:Lcom/facebook/config/a/a;

.field private final i:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Landroid/support/v4/a/e;

.field private final l:Lcom/facebook/c/s;

.field private final m:Lcom/facebook/orca/contacts/divebar/bn;

.field private final n:Lcom/facebook/orca/presence/d;

.field private o:Lcom/facebook/ui/touch/SwipableLinearLayout;

.field private p:Landroid/view/View;

.field private q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

.field private r:Lcom/facebook/orca/contacts/divebar/bl;

.field private s:Lcom/facebook/orca/common/ui/titlebar/m;

.field private t:I

.field private u:I

.field private v:I

.field private w:F

.field private x:I

.field private y:Lcom/facebook/orca/common/ui/titlebar/l;

.field private z:Lcom/facebook/orca/common/ui/titlebar/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 80
    const-class v0, Lcom/facebook/orca/common/ui/titlebar/a;

    sput-object v0, Lcom/facebook/orca/common/ui/titlebar/a;->c:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/view/inputmethod/InputMethodManager;Lcom/facebook/orca/f/k;Lcom/facebook/analytics/av;Lcom/facebook/config/a/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/common/ui/a/a;Ljava/util/Set;Landroid/support/v4/a/e;Lcom/facebook/c/s;Lcom/facebook/orca/contacts/divebar/bn;Lcom/facebook/orca/presence/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/inputmethod/InputMethodManager;",
            "Lcom/facebook/orca/f/k;",
            "Lcom/facebook/analytics/av;",
            "Lcom/facebook/config/a/a;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/orca/common/ui/a/a;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/contacts/divebar/bl;",
            ">;",
            "Landroid/support/v4/a/e;",
            "Lcom/facebook/c/s;",
            "Lcom/facebook/orca/contacts/divebar/bn;",
            "Lcom/facebook/orca/presence/d;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 169
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/m;->CLOSED:Lcom/facebook/orca/common/ui/titlebar/m;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    .line 171
    iput v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->t:I

    .line 172
    iput v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->u:I

    .line 173
    iput v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->v:I

    .line 174
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->w:F

    .line 175
    iput v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->x:I

    .line 214
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->e:Landroid/view/inputmethod/InputMethodManager;

    .line 215
    iput-object p2, p0, Lcom/facebook/orca/common/ui/titlebar/a;->g:Lcom/facebook/orca/f/k;

    .line 216
    iput-object p3, p0, Lcom/facebook/orca/common/ui/titlebar/a;->f:Lcom/facebook/analytics/av;

    .line 217
    iput-object p5, p0, Lcom/facebook/orca/common/ui/titlebar/a;->i:Ljavax/inject/a;

    .line 218
    iput-object p6, p0, Lcom/facebook/orca/common/ui/titlebar/a;->j:Ljavax/inject/a;

    .line 219
    iput-object p7, p0, Lcom/facebook/orca/common/ui/titlebar/a;->I:Lcom/facebook/orca/common/ui/a/a;

    .line 220
    iput-object p4, p0, Lcom/facebook/orca/common/ui/titlebar/a;->h:Lcom/facebook/config/a/a;

    .line 221
    iput-object p9, p0, Lcom/facebook/orca/common/ui/titlebar/a;->k:Landroid/support/v4/a/e;

    .line 222
    iput-object p10, p0, Lcom/facebook/orca/common/ui/titlebar/a;->l:Lcom/facebook/c/s;

    .line 223
    new-instance v0, Lcom/facebook/orca/common/ui/titlebar/p;

    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/a;->f:Lcom/facebook/analytics/av;

    invoke-direct {v0, v2}, Lcom/facebook/orca/common/ui/titlebar/p;-><init>(Lcom/facebook/analytics/av;)V

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->H:Lcom/facebook/orca/common/ui/titlebar/p;

    .line 224
    iput-object p11, p0, Lcom/facebook/orca/common/ui/titlebar/a;->m:Lcom/facebook/orca/contacts/divebar/bn;

    .line 225
    iput-object p12, p0, Lcom/facebook/orca/common/ui/titlebar/a;->n:Lcom/facebook/orca/presence/d;

    .line 226
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->i:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->j:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->E:Z

    .line 227
    iput-object p8, p0, Lcom/facebook/orca/common/ui/titlebar/a;->G:Ljava/util/Set;

    .line 228
    return-void

    :cond_0
    move v0, v1

    .line 226
    goto :goto_0
.end method

.method private A()Landroid/support/v4/app/q;
    .locals 1

    .prologue
    .line 489
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    check-cast v0, Lcom/facebook/base/activity/q;

    invoke-interface {v0}, Lcom/facebook/base/activity/q;->f()Landroid/support/v4/app/q;

    move-result-object v0

    return-object v0
.end method

.method private B()V
    .locals 2

    .prologue
    .line 578
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->a:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 579
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 580
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 582
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->I()Ljava/util/Set;

    move-result-object v0

    .line 583
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 584
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 585
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    goto :goto_0

    .line 587
    :cond_1
    return-void
.end method

.method private C()Lcom/facebook/orca/contacts/divebar/DivebarFragment;
    .locals 5

    .prologue
    .line 682
    sget-object v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DIVEBAR_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    move-result-object v0

    .line 684
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->A()Landroid/support/v4/app/q;

    move-result-object v1

    .line 685
    invoke-virtual {v1}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v2

    .line 687
    sget-object v3, Lcom/facebook/orca/common/ui/titlebar/a;->c:Ljava/lang/Class;

    const-string v4, "Replacing divebar fragment container with divebar."

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 688
    sget v3, Lcom/facebook/i;->orca_diverbar_fragment_container:I

    invoke-virtual {v2, v3, v0}, Landroid/support/v4/app/ad;->a(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 690
    invoke-virtual {v1}, Landroid/support/v4/app/q;->c()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 691
    invoke-virtual {v2}, Landroid/support/v4/app/ad;->a()I

    .line 692
    invoke-virtual {v1}, Landroid/support/v4/app/q;->b()Z

    .line 696
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private D()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 831
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->B:Lcom/facebook/ui/touch/a;

    if-eqz v0, :cond_0

    .line 833
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->B:Lcom/facebook/ui/touch/a;

    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->t()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->t()I

    move-result v2

    int-to-float v2, v2

    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->u()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0, v1, v4, v2, v3}, Lcom/facebook/ui/touch/a;->a(FFFF)V

    .line 840
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->C:Lcom/facebook/ui/touch/a;

    if-eqz v0, :cond_1

    .line 841
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->C:Lcom/facebook/ui/touch/a;

    iget v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->u:I

    int-to-float v1, v1

    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->u()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v4, v4, v1, v2}, Lcom/facebook/ui/touch/a;->a(FFFF)V

    .line 847
    :cond_1
    return-void
.end method

.method private E()V
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 852
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->a:Landroid/view/View;

    if-nez v0, :cond_0

    .line 853
    new-instance v0, Landroid/view/View;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->a:Landroid/view/View;

    .line 854
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->transparent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 856
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->a:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/j;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/j;-><init>(Lcom/facebook/orca/common/ui/titlebar/a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 863
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 864
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 865
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->b:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->a:Landroid/view/View;

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 870
    :cond_0
    return-void
.end method

.method private F()V
    .locals 2

    .prologue
    .line 873
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    if-eqz v0, :cond_0

    .line 874
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a(Ljava/lang/String;)V

    .line 876
    :cond_0
    return-void
.end method

.method private G()V
    .locals 2

    .prologue
    .line 879
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    invoke-virtual {v0}, Lcom/facebook/ui/touch/SwipableLinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 880
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->p:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 881
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->p:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 883
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    invoke-virtual {v0}, Lcom/facebook/ui/touch/SwipableLinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 885
    :cond_1
    return-void
.end method

.method private H()V
    .locals 2

    .prologue
    .line 888
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->a:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 889
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 891
    :cond_0
    return-void
.end method

.method private I()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .prologue
    .line 898
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 899
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 920
    :goto_0
    return-object v0

    .line 902
    :cond_0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 903
    const/4 v0, 0x0

    :goto_1
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/a;->b:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v0, v2, :cond_4

    .line 904
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/a;->b:Landroid/view/ViewGroup;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 905
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/a;->a:Landroid/view/View;

    if-eq v2, v3, :cond_1

    iget-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    if-eq v2, v3, :cond_1

    instance-of v3, v2, Lcom/facebook/debug/fps/i;

    if-eqz v3, :cond_2

    .line 903
    :cond_1
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 912
    :cond_2
    iget-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/a;->y:Lcom/facebook/orca/common/ui/titlebar/l;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/a;->y:Lcom/facebook/orca/common/ui/titlebar/l;

    invoke-interface {v3, v2}, Lcom/facebook/orca/common/ui/titlebar/l;->a(Landroid/view/View;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 917
    :cond_3
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    move-object v0, v1

    .line 920
    goto :goto_0
.end method

.method private J()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1036
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    instance-of v0, v0, Lcom/facebook/analytics/d;

    if-eqz v0, :cond_0

    .line 1037
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    check-cast v0, Lcom/facebook/analytics/d;

    invoke-interface {v0}, Lcom/facebook/analytics/d;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/analytics/f/a;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1039
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/facebook/analytics/f/a;->UNKNOWN:Lcom/facebook/analytics/f/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/f/a;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private K()Z
    .locals 2

    .prologue
    .line 1056
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->h:Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->i()Lcom/facebook/config/a/d;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private L()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1122
    iget-boolean v3, p0, Lcom/facebook/orca/common/ui/titlebar/a;->E:Z

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->i:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->j:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    :goto_0
    if-eq v3, v0, :cond_0

    .line 1124
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->i:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->j:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->E:Z

    .line 1127
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1129
    const-wide/16 v0, 0x0

    new-instance v2, Lcom/facebook/orca/common/ui/titlebar/k;

    invoke-direct {v2, p0}, Lcom/facebook/orca/common/ui/titlebar/k;-><init>(Lcom/facebook/orca/common/ui/titlebar/a;)V

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/common/ui/titlebar/a;->c(JLjava/lang/Runnable;)V

    .line 1141
    :cond_0
    :goto_2
    return-void

    :cond_1
    move v0, v2

    .line 1122
    goto :goto_0

    :cond_2
    move v0, v2

    .line 1124
    goto :goto_1

    .line 1138
    :cond_3
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->M()V

    goto :goto_2
.end method

.method private M()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1144
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    if-nez v0, :cond_0

    .line 1158
    :goto_0
    return-void

    .line 1147
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->A()Landroid/support/v4/app/q;

    move-result-object v0

    .line 1149
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/support/v4/app/q;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1150
    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v1

    .line 1151
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-virtual {v1, v2}, Landroid/support/v4/app/ad;->a(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 1152
    invoke-virtual {v1}, Landroid/support/v4/app/ad;->a()I

    .line 1153
    invoke-virtual {v0}, Landroid/support/v4/app/q;->b()Z

    .line 1155
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->G()V

    .line 1156
    iput-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    .line 1157
    iput-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/a;Lcom/a/a/ak;)Lcom/a/a/ak;
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->D:Lcom/a/a/ak;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/ui/touch/SwipableLinearLayout;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/a;Ljava/lang/String;Lcom/facebook/contacts/picker/ad;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Ljava/lang/String;Lcom/facebook/contacts/picker/ad;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;Lcom/facebook/contacts/picker/ad;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 983
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 984
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 986
    if-eqz p1, :cond_0

    .line 987
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 990
    :cond_0
    const/4 v0, 0x0

    .line 991
    instance-of v2, p2, Lcom/facebook/contacts/picker/ag;

    if-eqz v2, :cond_4

    .line 992
    check-cast p2, Lcom/facebook/contacts/picker/ag;

    invoke-virtual {p2}, Lcom/facebook/contacts/picker/ag;->j()Lcom/facebook/contacts/picker/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ah;->toString()Ljava/lang/String;

    move-result-object v0

    .line 997
    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    .line 998
    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1001
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->J()Ljava/lang/String;

    move-result-object v0

    .line 1002
    if-eqz v0, :cond_3

    .line 1003
    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1006
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 993
    :cond_4
    instance-of v2, p2, Lcom/facebook/orca/contacts/picker/ad;

    if-eqz v2, :cond_1

    .line 994
    const-string v0, "groups"

    goto :goto_0
.end method

.method private a(JLjava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 480
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->h()V

    .line 481
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/common/ui/titlebar/a;->b(JLjava/lang/Runnable;)V

    .line 482
    return-void
.end method

.method private a(Lcom/a/a/ak;)V
    .locals 2

    .prologue
    .line 550
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->D:Lcom/a/a/ak;

    if-eqz v0, :cond_0

    .line 551
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->D:Lcom/a/a/ak;

    invoke-virtual {v0}, Lcom/a/a/ak;->b()V

    .line 553
    :cond_0
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->D:Lcom/a/a/ak;

    .line 555
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->I()Ljava/util/Set;

    move-result-object v0

    .line 556
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 557
    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/m;->ANIMATING:Lcom/facebook/orca/common/ui/titlebar/m;

    iput-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    .line 559
    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/b;

    invoke-direct {v1, p0, v0}, Lcom/facebook/orca/common/ui/titlebar/b;-><init>(Lcom/facebook/orca/common/ui/titlebar/a;Ljava/util/Set;)V

    invoke-virtual {p1, v1}, Lcom/a/a/ak;->a(Lcom/a/a/ar;)V

    .line 566
    invoke-virtual {p1}, Lcom/a/a/ak;->a()V

    .line 568
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/a;JLjava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/common/ui/titlebar/a;->c(JLjava/lang/Runnable;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/a;Lcom/facebook/orca/common/ui/titlebar/m;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0, p1}, Lcom/facebook/orca/common/ui/titlebar/a;->b(Lcom/facebook/orca/common/ui/titlebar/m;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/a;Lcom/facebook/orca/threads/ThreadSummary;ZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/threads/ThreadSummary;ZLjava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/a;Lcom/facebook/user/UserWithIdentifier;ZLcom/facebook/contacts/picker/ad;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/user/UserWithIdentifier;ZLcom/facebook/contacts/picker/ad;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/a;Ljava/util/Set;F)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Ljava/util/Set;F)V

    return-void
.end method

.method private a(Lcom/facebook/orca/common/ui/titlebar/m;JLjava/lang/Runnable;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 593
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->b:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    if-nez v0, :cond_1

    .line 594
    :cond_0
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/a;->c:Ljava/lang/Class;

    const-string v1, "unable to start animation - failed to locate divebar elements"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 661
    :goto_0
    return-void

    .line 598
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    if-nez v0, :cond_2

    .line 599
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/a;->c:Ljava/lang/Class;

    const-string v1, "unable to start animation - divebar fragment is not ready"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 603
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->v()I

    move-result v0

    .line 605
    iget v2, p0, Lcom/facebook/orca/common/ui/titlebar/a;->t:I

    .line 606
    sget-object v3, Lcom/facebook/orca/common/ui/titlebar/m;->OPENED:Lcom/facebook/orca/common/ui/titlebar/m;

    if-ne p1, v3, :cond_3

    neg-int v0, v0

    .line 608
    :goto_1
    const/4 v3, 0x2

    new-array v3, v3, [F

    int-to-float v2, v2

    aput v2, v3, v1

    const/4 v1, 0x1

    int-to-float v0, v0

    aput v0, v3, v1

    invoke-static {v3}, Lcom/a/a/ak;->b([F)Lcom/a/a/ak;

    move-result-object v0

    .line 609
    invoke-virtual {v0, p2, p3}, Lcom/a/a/ak;->c(J)Lcom/a/a/ak;

    .line 610
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Lcom/a/a/ak;->a(Landroid/view/animation/Interpolator;)V

    .line 611
    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/c;

    invoke-direct {v1, p0, p1, p4}, Lcom/facebook/orca/common/ui/titlebar/c;-><init>(Lcom/facebook/orca/common/ui/titlebar/a;Lcom/facebook/orca/common/ui/titlebar/m;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Lcom/a/a/ak;->a(Lcom/a/a/b;)V

    .line 659
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->B()V

    .line 660
    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/a/a/ak;)V

    goto :goto_0

    :cond_3
    move v0, v1

    .line 606
    goto :goto_1
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;ZLjava/lang/String;)V
    .locals 3

    .prologue
    .line 969
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    const-class v2, Lcom/facebook/orca/threadview/ThreadViewActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 970
    const-string v1, "thread_id"

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 972
    const-string v1, "focus_compose"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 973
    const-string v1, "trigger"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 974
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 975
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->l:Lcom/facebook/c/s;

    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 977
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->l()V

    .line 978
    return-void
.end method

.method private a(Lcom/facebook/user/UserWithIdentifier;ZLcom/facebook/contacts/picker/ad;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 928
    .line 929
    invoke-virtual {p1}, Lcom/facebook/user/UserWithIdentifier;->c()Lcom/facebook/user/UserIdentifier;

    move-result-object v2

    .line 930
    invoke-virtual {v2}, Lcom/facebook/user/UserIdentifier;->e()Lcom/facebook/user/s;

    move-result-object v3

    .line 934
    sget-object v0, Lcom/facebook/user/s;->FBID:Lcom/facebook/user/s;

    if-ne v3, v0, :cond_1

    .line 935
    invoke-virtual {p1}, Lcom/facebook/user/UserWithIdentifier;->a()Lcom/facebook/user/User;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 940
    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->toString()Ljava/lang/String;

    move-result-object v0

    .line 942
    :goto_1
    instance-of v4, p3, Lcom/facebook/contacts/picker/ag;

    if-eqz v4, :cond_0

    .line 943
    check-cast p3, Lcom/facebook/contacts/picker/ag;

    invoke-virtual {p3}, Lcom/facebook/contacts/picker/ag;->j()Lcom/facebook/contacts/picker/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/contacts/picker/ah;->toString()Ljava/lang/String;

    move-result-object v1

    .line 946
    :cond_0
    invoke-virtual {v3}, Lcom/facebook/user/s;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v0, v3, p2, v1}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 948
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    const-class v3, Lcom/facebook/orca/threadview/ThreadViewActivity;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 949
    new-instance v1, Lcom/facebook/user/RecipientInfo;

    invoke-virtual {p1}, Lcom/facebook/user/UserWithIdentifier;->a()Lcom/facebook/user/User;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/user/User;->d()Lcom/facebook/user/Name;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/facebook/user/RecipientInfo;-><init>(Lcom/facebook/user/UserIdentifier;Lcom/facebook/user/Name;)V

    .line 953
    invoke-static {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Lcom/facebook/user/RecipientInfo;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v1

    .line 955
    const-string v2, "thread_view_spec"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 956
    const-string v1, "focus_compose"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 957
    const-string v1, "trigger"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 958
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 959
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->l:Lcom/facebook/c/s;

    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 961
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->l()V

    .line 962
    return-void

    .line 936
    :cond_1
    sget-object v0, Lcom/facebook/user/s;->PHONE:Lcom/facebook/user/s;

    if-ne v3, v0, :cond_3

    .line 937
    new-instance v0, Lcom/facebook/user/UserKey;

    sget-object v4, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    invoke-virtual {v2}, Lcom/facebook/user/UserIdentifier;->d()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v4, v5}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 940
    goto :goto_1

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 2

    .prologue
    .line 1012
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "click"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "divebar_contact"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "contact_type"

    invoke-virtual {v0, v1, p2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "filtered"

    invoke-virtual {v0, v1, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 1018
    if-eqz p4, :cond_0

    .line 1019
    const-string v1, "section_type"

    invoke-virtual {v0, v1, p4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 1022
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->J()Ljava/lang/String;

    move-result-object v1

    .line 1023
    if-eqz v1, :cond_1

    .line 1024
    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 1027
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->f:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 1028
    return-void
.end method

.method private a(Ljava/util/Set;F)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Landroid/view/View;",
            ">;F)V"
        }
    .end annotation

    .prologue
    .line 571
    float-to-int v0, p2

    iput v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->t:I

    .line 572
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 573
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/a;->I:Lcom/facebook/orca/common/ui/a/a;

    invoke-virtual {v2, v0, p2}, Lcom/facebook/orca/common/ui/a/a;->a(Landroid/view/View;F)V

    goto :goto_0

    .line 575
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/a;Z)Z
    .locals 0

    .prologue
    .line 77
    iput-boolean p1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->F:Z

    return p1
.end method

.method private a(Lcom/facebook/orca/common/ui/titlebar/m;)Z
    .locals 1

    .prologue
    .line 493
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->A()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 496
    const/4 v0, 0x0

    .line 503
    :goto_0
    return v0

    .line 499
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->A:Lcom/facebook/orca/common/ui/titlebar/n;

    if-eqz v0, :cond_1

    .line 500
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->A:Lcom/facebook/orca/common/ui/titlebar/n;

    invoke-interface {v0, p1}, Lcom/facebook/orca/common/ui/titlebar/n;->a(Lcom/facebook/orca/common/ui/titlebar/m;)Z

    move-result v0

    goto :goto_0

    .line 503
    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private b(I)V
    .locals 2

    .prologue
    .line 337
    .line 338
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->v()I

    move-result v0

    neg-int v0, v0

    .line 340
    if-lez p1, :cond_1

    .line 341
    const/4 p1, 0x0

    .line 346
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->I()Ljava/util/Set;

    move-result-object v0

    int-to-float v1, p1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Ljava/util/Set;F)V

    .line 347
    return-void

    .line 342
    :cond_1
    if-ge p1, v0, :cond_0

    move p1, v0

    .line 343
    goto :goto_0
.end method

.method private b(JLjava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 485
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/m;->OPENED:Lcom/facebook/orca/common/ui/titlebar/m;

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/m;JLjava/lang/Runnable;)V

    .line 486
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/common/ui/titlebar/a;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->H()V

    return-void
.end method

.method private b(Lcom/facebook/orca/common/ui/titlebar/m;)V
    .locals 3

    .prologue
    .line 664
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    if-eq v0, p1, :cond_1

    .line 665
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    .line 666
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/m;->OPENED:Lcom/facebook/orca/common/ui/titlebar/m;

    if-ne v0, p1, :cond_2

    .line 667
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->m:Lcom/facebook/orca/contacts/divebar/bn;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/bn;->b()V

    .line 668
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->n:Lcom/facebook/orca/presence/d;

    invoke-virtual {v0}, Lcom/facebook/orca/presence/d;->b()V

    .line 669
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->f:Lcom/facebook/analytics/av;

    const-string v1, "divebar"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/analytics/av;->b(Ljava/lang/String;Z)V

    .line 674
    :cond_0
    :goto_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 675
    const-string v1, "com.facebook.orca.common.ui.titlebar.DIVEBAR_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 676
    const-string v1, "state"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 677
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->k:Landroid/support/v4/a/e;

    invoke-virtual {v1, v0}, Landroid/support/v4/a/e;->a(Landroid/content/Intent;)Z

    .line 679
    :cond_1
    return-void

    .line 670
    :cond_2
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/m;->CLOSED:Lcom/facebook/orca/common/ui/titlebar/m;

    if-ne v0, p1, :cond_0

    .line 671
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->f:Lcom/facebook/analytics/av;

    const-string v1, "divebar"

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private c(I)I
    .locals 4

    .prologue
    .line 379
    iget v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->v:I

    .line 380
    iget v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->u:I

    if-nez v1, :cond_0

    .line 381
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/g;->divebar_left_margin_width:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->u:I

    .line 384
    :cond_0
    iget v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->u:I

    sub-int v1, p1, v1

    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/facebook/g;->divebar_max_width:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->v:I

    .line 386
    iget v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->v:I

    if-eq v1, v0, :cond_1

    .line 387
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->t()I

    move-result v0

    iget v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->v:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->u:I

    .line 388
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->w()V

    .line 389
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->D()V

    .line 391
    :cond_1
    iget v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->v:I

    return v0
.end method

.method static synthetic c(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/orca/contacts/divebar/DivebarFragment;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    return-object v0
.end method

.method private c(JLjava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 536
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->H:Lcom/facebook/orca/common/ui/titlebar/p;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/p;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 537
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->H:Lcom/facebook/orca/common/ui/titlebar/p;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/p;->c()V

    .line 539
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/m;->CLOSED:Lcom/facebook/orca/common/ui/titlebar/m;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/m;->ANIMATING:Lcom/facebook/orca/common/ui/titlebar/m;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/m;->CLOSED:Lcom/facebook/orca/common/ui/titlebar/m;

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/m;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 546
    :cond_1
    :goto_0
    return-void

    .line 544
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->y()V

    .line 545
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/m;->CLOSED:Lcom/facebook/orca/common/ui/titlebar/m;

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/m;JLjava/lang/Runnable;)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/facebook/orca/common/ui/titlebar/a;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->p()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/common/ui/titlebar/a;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->F()V

    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/common/ui/titlebar/a;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->G()V

    return-void
.end method

.method static synthetic g(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/orca/common/ui/titlebar/l;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->y:Lcom/facebook/orca/common/ui/titlebar/l;

    return-object v0
.end method

.method static synthetic h(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/orca/common/ui/titlebar/m;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    return-object v0
.end method

.method static synthetic i(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/orca/common/ui/titlebar/p;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->H:Lcom/facebook/orca/common/ui/titlebar/p;

    return-object v0
.end method

.method static synthetic j(Lcom/facebook/orca/common/ui/titlebar/a;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->G:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic k(Lcom/facebook/orca/common/ui/titlebar/a;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->z()V

    return-void
.end method

.method static synthetic l(Lcom/facebook/orca/common/ui/titlebar/a;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic m(Lcom/facebook/orca/common/ui/titlebar/a;)Z
    .locals 1

    .prologue
    .line 77
    iget-boolean v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->F:Z

    return v0
.end method

.method static synthetic n(Lcom/facebook/orca/common/ui/titlebar/a;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->L()V

    return-void
.end method

.method private o()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 256
    new-instance v0, Lcom/facebook/ui/touch/a;

    new-array v1, v5, [Ljava/lang/Integer;

    const/4 v2, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/facebook/g;->divebar_swipe__vertical_threshold:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/facebook/g;->divebar_swipe__to_open_horizontal_threshold:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    int-to-float v3, v3

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/facebook/ui/touch/a;-><init>(Lcom/facebook/ui/touch/d;Ljava/util/List;FF)V

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->B:Lcom/facebook/ui/touch/a;

    .line 263
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->B:Lcom/facebook/ui/touch/a;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/g;->divebar_swipe__orthogonal_threshold:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/touch/a;->a(F)V

    .line 265
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->B:Lcom/facebook/ui/touch/a;

    invoke-virtual {v0, v5}, Lcom/facebook/ui/touch/a;->a(Z)V

    .line 267
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->D()V

    .line 269
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->r()Lcom/facebook/ui/touch/f;

    move-result-object v0

    .line 270
    if-eqz v0, :cond_0

    .line 271
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->B:Lcom/facebook/ui/touch/a;

    invoke-interface {v0, v1}, Lcom/facebook/ui/touch/f;->a(Lcom/facebook/ui/touch/a;)V

    .line 273
    :cond_0
    return-void
.end method

.method static synthetic o(Lcom/facebook/orca/common/ui/titlebar/a;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->M()V

    return-void
.end method

.method private p()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 276
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    if-eqz v0, :cond_0

    .line 277
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    .line 278
    new-instance v1, Lcom/facebook/ui/touch/a;

    new-array v2, v6, [Ljava/lang/Integer;

    const/4 v3, 0x0

    const/4 v4, -0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/facebook/g;->divebar_swipe__vertical_threshold:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/facebook/g;->divebar_swipe__to_close_horizontal_threshold:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    int-to-float v4, v4

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/facebook/ui/touch/a;-><init>(Lcom/facebook/ui/touch/d;Ljava/util/List;FF)V

    iput-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->C:Lcom/facebook/ui/touch/a;

    .line 285
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->C:Lcom/facebook/ui/touch/a;

    invoke-virtual {v1, v6}, Lcom/facebook/ui/touch/a;->a(Z)V

    .line 287
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->D()V

    .line 289
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->C:Lcom/facebook/ui/touch/a;

    invoke-interface {v0, v1}, Lcom/facebook/ui/touch/f;->a(Lcom/facebook/ui/touch/a;)V

    .line 291
    :cond_0
    return-void
.end method

.method private q()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 294
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->r()Lcom/facebook/ui/touch/f;

    move-result-object v0

    .line 295
    if-eqz v0, :cond_0

    .line 296
    invoke-interface {v0}, Lcom/facebook/ui/touch/f;->a()V

    .line 299
    :cond_0
    iput-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->B:Lcom/facebook/ui/touch/a;

    .line 300
    iput-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->C:Lcom/facebook/ui/touch/a;

    .line 301
    return-void
.end method

.method private r()Lcom/facebook/ui/touch/f;
    .locals 3

    .prologue
    .line 304
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->b:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 305
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 306
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 307
    if-eqz v0, :cond_0

    instance-of v2, v0, Lcom/facebook/ui/touch/f;

    if-eqz v2, :cond_0

    .line 308
    check-cast v0, Lcom/facebook/ui/touch/f;

    .line 313
    :goto_1
    return-object v0

    .line 305
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 313
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private s()I
    .locals 2

    .prologue
    .line 350
    const/4 v0, 0x0

    .line 352
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->b:Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    .line 353
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    .line 356
    :cond_0
    if-gtz v0, :cond_1

    .line 357
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->t()I

    move-result v0

    .line 360
    :cond_1
    return v0
.end method

.method private t()I
    .locals 1

    .prologue
    .line 364
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    return v0
.end method

.method private u()I
    .locals 1

    .prologue
    .line 368
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    return v0
.end method

.method private v()I
    .locals 1

    .prologue
    .line 372
    iget v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->v:I

    if-gtz v0, :cond_0

    .line 373
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->t()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/a;->c(I)I

    .line 375
    :cond_0
    iget v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->v:I

    return v0
.end method

.method private w()V
    .locals 3

    .prologue
    .line 395
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->x()V

    .line 396
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/m;->CLOSED:Lcom/facebook/orca/common/ui/titlebar/m;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    if-nez v0, :cond_1

    .line 401
    :cond_0
    :goto_0
    return-void

    .line 400
    :cond_1
    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/common/ui/titlebar/a;->b(JLjava/lang/Runnable;)V

    goto :goto_0
.end method

.method private x()V
    .locals 3

    .prologue
    .line 404
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    if-eqz v0, :cond_0

    .line 405
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    sget v1, Lcom/facebook/i;->empty:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/touch/SwipableLinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 406
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 407
    iget v2, p0, Lcom/facebook/orca/common/ui/titlebar/a;->u:I

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 408
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 410
    :cond_0
    return-void
.end method

.method private y()V
    .locals 3

    .prologue
    .line 413
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    if-nez v0, :cond_0

    .line 414
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DivebarController not attached to an activity"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 417
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->b:Landroid/view/ViewGroup;

    if-nez v0, :cond_1

    .line 431
    :goto_0
    return-void

    .line 421
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->y:Lcom/facebook/orca/common/ui/titlebar/l;

    if-eqz v0, :cond_2

    .line 422
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->y:Lcom/facebook/orca/common/ui/titlebar/l;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    invoke-interface {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/l;->a(Lcom/facebook/orca/common/ui/titlebar/m;)V

    .line 425
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->k()V

    .line 426
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->E()V

    .line 429
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->e:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    goto :goto_0
.end method

.method private z()V
    .locals 1

    .prologue
    .line 447
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->s()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/a;->c(I)I

    .line 448
    return-void
.end method


# virtual methods
.method public a(FF)V
    .locals 1

    .prologue
    .line 1061
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1077
    :goto_0
    return-void

    .line 1065
    :cond_0
    iput p1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->w:F

    .line 1066
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1067
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->h()V

    .line 1068
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->x:I

    .line 1073
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->z:Lcom/facebook/orca/common/ui/titlebar/o;

    if-eqz v0, :cond_1

    .line 1074
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->z:Lcom/facebook/orca/common/ui/titlebar/o;

    invoke-interface {v0, p1, p2}, Lcom/facebook/orca/common/ui/titlebar/o;->a(FF)V

    .line 1076
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->B()V

    goto :goto_0

    .line 1070
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->v()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->x:I

    goto :goto_1
.end method

.method public a(FFI)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x32

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 1091
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    if-nez v0, :cond_1

    .line 1107
    :cond_0
    :goto_0
    return-void

    .line 1095
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-static {v0}, Lcom/facebook/analytics/i/c;->a(Landroid/content/Context;)Lcom/facebook/analytics/av;

    move-result-object v0

    const-string v1, "swipe"

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Ljava/lang/String;)V

    .line 1098
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->B:Lcom/facebook/ui/touch/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->B:Lcom/facebook/ui/touch/a;

    invoke-virtual {v0}, Lcom/facebook/ui/touch/a;->a()F

    move-result v0

    cmpg-float v0, v0, v2

    if-gez v0, :cond_2

    .line 1100
    invoke-direct {p0, v4, v5, v3}, Lcom/facebook/orca/common/ui/titlebar/a;->b(JLjava/lang/Runnable;)V

    goto :goto_0

    .line 1101
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->C:Lcom/facebook/ui/touch/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->C:Lcom/facebook/ui/touch/a;

    invoke-virtual {v0}, Lcom/facebook/ui/touch/a;->a()F

    move-result v0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    .line 1103
    invoke-direct {p0, v4, v5, v3}, Lcom/facebook/orca/common/ui/titlebar/a;->c(JLjava/lang/Runnable;)V

    goto :goto_0

    .line 1105
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->i()V

    goto :goto_0
.end method

.method public a(I)V
    .locals 3

    .prologue
    .line 471
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/m;->OPENED:Lcom/facebook/orca/common/ui/titlebar/m;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/m;->ANIMATING:Lcom/facebook/orca/common/ui/titlebar/m;

    if-eq v0, v1, :cond_0

    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/m;->OPENED:Lcom/facebook/orca/common/ui/titlebar/m;

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/m;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 477
    :cond_0
    :goto_0
    return-void

    .line 476
    :cond_1
    int-to-long v0, p1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/common/ui/titlebar/a;->a(JLjava/lang/Runnable;)V

    goto :goto_0
.end method

.method public a(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 236
    instance-of v0, p1, Lcom/facebook/base/activity/q;

    if-nez v0, :cond_0

    .line 237
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DivebarController must be attached to a FragmentEnabledActivity"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 240
    :cond_0
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    .line 241
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->b:Landroid/view/ViewGroup;

    .line 244
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->t()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/a;->c(I)I

    .line 245
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->n()V

    .line 246
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 252
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->b:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(FF)V
    .locals 2

    .prologue
    .line 1081
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1087
    :goto_0
    return-void

    .line 1085
    :cond_0
    iget v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->w:F

    sub-float v0, p1, v0

    float-to-int v0, v0

    iget v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->x:I

    sub-int/2addr v0, v1

    .line 1086
    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/a;->b(I)V

    goto :goto_0
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 325
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/m;->OPENED:Lcom/facebook/orca/common/ui/titlebar/m;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(FF)V
    .locals 0

    .prologue
    .line 1111
    return-void
.end method

.method public c()Z
    .locals 2

    .prologue
    .line 329
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/m;->CLOSED:Lcom/facebook/orca/common/ui/titlebar/m;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Lcom/facebook/orca/common/ui/titlebar/m;
    .locals 1

    .prologue
    .line 333
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    return-object v0
.end method

.method public e()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 434
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 441
    :goto_0
    return-void

    .line 438
    :cond_0
    iput v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->u:I

    .line 439
    iput v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->v:I

    .line 440
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->t()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/a;->c(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->v:I

    goto :goto_0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 451
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 452
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->j()V

    .line 453
    const/4 v0, 0x1

    .line 455
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()V
    .locals 1

    .prologue
    .line 463
    const/16 v0, 0x8c

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/a;->a(I)V

    .line 464
    return-void
.end method

.method public h()V
    .locals 2

    .prologue
    .line 507
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->y()V

    .line 510
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->I()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 511
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    goto :goto_0

    .line 514
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    if-eqz v0, :cond_1

    .line 515
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/ui/touch/SwipableLinearLayout;->setVisibility(I)V

    .line 518
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->s()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 519
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a()V

    .line 520
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->b()V

    .line 522
    :cond_2
    return-void
.end method

.method public i()V
    .locals 4

    .prologue
    .line 525
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/m;->ANIMATING:Lcom/facebook/orca/common/ui/titlebar/m;

    if-eq v0, v1, :cond_0

    .line 526
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->y()V

    .line 527
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->s:Lcom/facebook/orca/common/ui/titlebar/m;

    const-wide/16 v1, 0x19

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/m;JLjava/lang/Runnable;)V

    .line 529
    :cond_0
    return-void
.end method

.method public j()V
    .locals 3

    .prologue
    .line 532
    const-wide/16 v0, 0x8c

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/common/ui/titlebar/a;->c(JLjava/lang/Runnable;)V

    .line 533
    return-void
.end method

.method public k()V
    .locals 7

    .prologue
    const v6, 0x1020002

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v3, -0x1

    .line 701
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    if-nez v0, :cond_0

    .line 702
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 703
    sget v2, Lcom/facebook/k;->orca_divebar:I

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v0, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/facebook/i;->divebar_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/touch/SwipableLinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    .line 707
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/facebook/ui/touch/SwipableLinearLayout;->setVisibility(I)V

    .line 708
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->x()V

    .line 710
    new-instance v0, Lcom/facebook/orca/common/ui/titlebar/e;

    invoke-direct {v0, p0}, Lcom/facebook/orca/common/ui/titlebar/e;-><init>(Lcom/facebook/orca/common/ui/titlebar/a;)V

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->r:Lcom/facebook/orca/contacts/divebar/bl;

    .line 760
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/f;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/f;-><init>(Lcom/facebook/orca/common/ui/titlebar/a;)V

    invoke-virtual {v0, v1}, Lcom/facebook/ui/touch/SwipableLinearLayout;->setOnSizeChangedListener(Lcom/facebook/ui/touch/e;)V

    .line 769
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    sget v1, Lcom/facebook/i;->empty:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/touch/SwipableLinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 771
    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/g;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/g;-><init>(Lcom/facebook/orca/common/ui/titlebar/a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 781
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->p:Landroid/view/View;

    if-nez v0, :cond_1

    .line 782
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 783
    sget v2, Lcom/facebook/k;->focusable_dummy_view:I

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v0, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->p:Landroid/view/View;

    .line 790
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    invoke-virtual {v0}, Lcom/facebook/ui/touch/SwipableLinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_2

    .line 791
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/ui/touch/SwipableLinearLayout;->setVisibility(I)V

    .line 792
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->b:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->o:Lcom/facebook/ui/touch/SwipableLinearLayout;

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 797
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    if-nez v0, :cond_3

    .line 798
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->C()Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    .line 799
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    if-nez v0, :cond_4

    .line 800
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/a;->c:Ljava/lang/Class;

    const-string v1, "Cannot attach divebar to activity %s."

    new-array v2, v5, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    :cond_3
    :goto_0
    return-void

    .line 803
    :cond_4
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/a;->c:Ljava/lang/Class;

    const-string v1, "DivebarFragment created for activity: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/a;->d:Landroid/app/Activity;

    aput-object v3, v2, v4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 804
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/a;->r:Lcom/facebook/orca/contacts/divebar/bl;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a(Lcom/facebook/orca/contacts/divebar/bl;)V

    .line 806
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->q:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/h;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/h;-><init>(Lcom/facebook/orca/common/ui/titlebar/a;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a(Lcom/facebook/orca/contacts/divebar/z;)V

    goto :goto_0
.end method

.method public l()V
    .locals 1

    .prologue
    .line 1032
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->F:Z

    .line 1033
    return-void
.end method

.method public m()V
    .locals 1

    .prologue
    .line 1044
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->K()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->B:Lcom/facebook/ui/touch/a;

    if-eqz v0, :cond_0

    .line 1045
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->q()V

    .line 1047
    :cond_0
    return-void
.end method

.method public n()V
    .locals 1

    .prologue
    .line 1050
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->K()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/a;->B:Lcom/facebook/ui/touch/a;

    if-nez v0, :cond_0

    .line 1051
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/a;->o()V

    .line 1053
    :cond_0
    return-void
.end method
