.class public Lcom/facebook/orca/contacts/divebar/aa;
.super Ljava/lang/Object;
.source "DivebarGroupsMegaphoneController.java"

# interfaces
.implements Lcom/facebook/contacts/picker/p;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/analytics/av;

.field private final e:Lcom/facebook/base/broadcast/j;

.field private final f:Lcom/facebook/c/s;

.field private final g:Landroid/content/res/Resources;

.field private final h:Lcom/facebook/common/time/a;

.field private i:Landroid/view/ViewGroup;

.field private j:Lcom/facebook/contacts/picker/q;

.field private k:Landroid/view/ViewGroup;

.field private l:Landroid/view/View;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/facebook/orca/contacts/divebar/aa;

    sput-object v0, Lcom/facebook/orca/contacts/divebar/aa;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;Ljavax/inject/a;Lcom/facebook/analytics/av;Lcom/facebook/base/broadcast/j;Lcom/facebook/c/s;Landroid/content/res/Resources;Lcom/facebook/common/time/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/d;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/analytics/av;",
            "Lcom/facebook/base/broadcast/j;",
            "Lcom/facebook/c/s;",
            "Landroid/content/res/Resources;",
            "Lcom/facebook/common/time/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/aa;->b:Lcom/facebook/prefs/shared/d;

    .line 69
    iput-object p2, p0, Lcom/facebook/orca/contacts/divebar/aa;->c:Ljavax/inject/a;

    .line 70
    iput-object p3, p0, Lcom/facebook/orca/contacts/divebar/aa;->d:Lcom/facebook/analytics/av;

    .line 71
    iput-object p4, p0, Lcom/facebook/orca/contacts/divebar/aa;->e:Lcom/facebook/base/broadcast/j;

    .line 72
    iput-object p5, p0, Lcom/facebook/orca/contacts/divebar/aa;->f:Lcom/facebook/c/s;

    .line 73
    iput-object p6, p0, Lcom/facebook/orca/contacts/divebar/aa;->g:Landroid/content/res/Resources;

    .line 74
    iput-object p7, p0, Lcom/facebook/orca/contacts/divebar/aa;->h:Lcom/facebook/common/time/a;

    .line 75
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/aa;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/aa;->d()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/contacts/divebar/aa;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/aa;->c()V

    return-void
.end method

.method private c()V
    .locals 3

    .prologue
    .line 136
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/aa;->d()V

    .line 137
    iget-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->o:Z

    if-nez v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->d:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "divebar_groups_megaphone_action_button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 142
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/aa;->i:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 143
    sget-object v1, Lcom/facebook/orca/creation/CreateThreadActivity;->r:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 144
    const-string v1, "trigger"

    const-string v2, "divebar_groups_megaphone_action_button"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 145
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/aa;->f:Lcom/facebook/c/s;

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/aa;->i:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 147
    :cond_0
    return-void
.end method

.method private d()V
    .locals 3

    .prologue
    .line 150
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/n;->P:Lcom/facebook/prefs/shared/ae;

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 154
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->k:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->i:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/aa;->k:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 156
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->j:Lcom/facebook/contacts/picker/q;

    invoke-interface {v0}, Lcom/facebook/contacts/picker/q;->a()V

    .line 157
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->e:Lcom/facebook/base/broadcast/j;

    const-string v1, "com.facebook.orca.contacts.divebar.GROUP_MEGAPHONE_DISMISSED"

    invoke-interface {v0, v1}, Lcom/facebook/base/broadcast/j;->a(Ljava/lang/String;)V

    .line 159
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;Lcom/facebook/contacts/picker/q;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 80
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/aa;->i:Landroid/view/ViewGroup;

    .line 81
    iput-object p2, p0, Lcom/facebook/orca/contacts/divebar/aa;->j:Lcom/facebook/contacts/picker/q;

    .line 83
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->b:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/background/n;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v2, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->o:Z

    .line 86
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->k:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->i:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 88
    sget v2, Lcom/facebook/k;->orca_divebar_groups_nux:I

    iget-object v3, p0, Lcom/facebook/orca/contacts/divebar/aa;->i:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->k:Landroid/view/ViewGroup;

    .line 90
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->k:Landroid/view/ViewGroup;

    sget v2, Lcom/facebook/i;->divebar_groups_megaphone_dismiss_button:I

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->l:Landroid/view/View;

    .line 91
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->l:Landroid/view/View;

    new-instance v2, Lcom/facebook/orca/contacts/divebar/ab;

    invoke-direct {v2, p0}, Lcom/facebook/orca/contacts/divebar/ab;-><init>(Lcom/facebook/orca/contacts/divebar/aa;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->k:Landroid/view/ViewGroup;

    sget v2, Lcom/facebook/i;->divebar_groups_megaphone_body:I

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->m:Landroid/widget/TextView;

    .line 100
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->k:Landroid/view/ViewGroup;

    sget v2, Lcom/facebook/i;->divebar_groups_megaphone_action_button:I

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->n:Landroid/widget/TextView;

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->n:Landroid/widget/TextView;

    new-instance v2, Lcom/facebook/orca/contacts/divebar/ac;

    invoke-direct {v2, p0}, Lcom/facebook/orca/contacts/divebar/ac;-><init>(Lcom/facebook/orca/contacts/divebar/aa;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->o:Z

    if-eqz v0, :cond_3

    .line 112
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->g:Landroid/content/res/Resources;

    sget v2, Lcom/facebook/o;->groups_megaphone_body_see_groups:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 113
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->g:Landroid/content/res/Resources;

    sget v3, Lcom/facebook/o;->see_groups_label:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v3, v2

    move-object v2, v0

    move v0, v1

    .line 120
    :goto_1
    iget-object v4, p0, Lcom/facebook/orca/contacts/divebar/aa;->m:Landroid/widget/TextView;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    iget-object v3, p0, Lcom/facebook/orca/contacts/divebar/aa;->n:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/aa;->n:Landroid/widget/TextView;

    invoke-virtual {v2, v0, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 124
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->i:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/aa;->k:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 126
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->b:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/prefs/n;->P:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v2, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    .line 127
    if-ltz v0, :cond_1

    .line 128
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/aa;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/prefs/n;->P:Lcom/facebook/prefs/shared/ae;

    add-int/lit8 v0, v0, 0x1

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 133
    :cond_1
    return-void

    :cond_2
    move v0, v1

    .line 83
    goto/16 :goto_0

    .line 116
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->g:Landroid/content/res/Resources;

    sget v2, Lcom/facebook/o;->groups_megaphone_body_create_group:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 117
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->g:Landroid/content/res/Resources;

    sget v2, Lcom/facebook/o;->create_group_label:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 118
    sget v0, Lcom/facebook/h;->groups_megaphone_blue_button_plus:I

    goto :goto_1
.end method

.method public a()Z
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 163
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 179
    :goto_0
    return v0

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->b:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/orca/background/n;->b:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v4, 0x0

    invoke-interface {v0, v3, v4, v5}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v3

    .line 169
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->h:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v5

    sub-long v3, v5, v3

    .line 170
    const-wide/32 v5, 0xf731400

    cmp-long v0, v3, v5

    if-lez v0, :cond_1

    move v0, v1

    .line 171
    goto :goto_0

    .line 174
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->b:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/orca/prefs/n;->P:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v3, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    .line 175
    sget-object v3, Lcom/facebook/orca/contacts/divebar/aa;->a:Ljava/lang/Class;

    const-string v4, "show count: %d"

    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-static {v3, v4, v5}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    if-ltz v0, :cond_2

    const/4 v3, 0x3

    if-ge v0, v3, :cond_2

    move v0, v2

    .line 177
    goto :goto_0

    :cond_2
    move v0, v1

    .line 179
    goto :goto_0
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 183
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->k:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aa;->k:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/aa;->i:Landroid/view/ViewGroup;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
