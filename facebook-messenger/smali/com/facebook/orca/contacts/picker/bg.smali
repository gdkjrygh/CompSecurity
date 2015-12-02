.class public Lcom/facebook/orca/contacts/picker/bg;
.super Ljava/lang/Object;
.source "InviteAllViewController.java"

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
.field private b:Lcom/facebook/prefs/shared/d;

.field private c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/view/View$OnClickListener;

.field private e:Landroid/view/View$OnClickListener;

.field private f:I

.field private g:Landroid/view/View;

.field private h:Landroid/view/ViewGroup;

.field private i:Lcom/facebook/contacts/picker/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const-class v0, Lcom/facebook/orca/contacts/picker/bg;

    sput-object v0, Lcom/facebook/orca/contacts/picker/bg;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/d;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bg;->b:Lcom/facebook/prefs/shared/d;

    .line 49
    iput-object p2, p0, Lcom/facebook/orca/contacts/picker/bg;->c:Ljavax/inject/a;

    .line 50
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;I)V
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bg;->d:Landroid/view/View$OnClickListener;

    .line 62
    iput-object p2, p0, Lcom/facebook/orca/contacts/picker/bg;->e:Landroid/view/View$OnClickListener;

    .line 63
    iput p3, p0, Lcom/facebook/orca/contacts/picker/bg;->f:I

    .line 64
    return-void
.end method

.method public a(Landroid/view/ViewGroup;Lcom/facebook/contacts/picker/q;)V
    .locals 8

    .prologue
    const/4 v5, 0x1

    const/4 v7, 0x0

    .line 80
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bg;->h:Landroid/view/ViewGroup;

    .line 81
    iput-object p2, p0, Lcom/facebook/orca/contacts/picker/bg;->i:Lcom/facebook/contacts/picker/q;

    .line 82
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bg;->h:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 83
    sget v1, Lcom/facebook/k;->orca_divebar_invite_all_section:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/bg;->g:Landroid/view/View;

    .line 84
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bg;->h:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/bg;->g:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 86
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bg;->g:Landroid/view/View;

    sget v1, Lcom/facebook/i;->contact_picker_invite_all_invite_button:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 88
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/bg;->g:Landroid/view/View;

    sget v2, Lcom/facebook/i;->contact_picker_invite_all_dismiss_button:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 91
    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/bg;->d:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/bg;->e:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/bg;->g:Landroid/view/View;

    sget v2, Lcom/facebook/i;->contact_picker_invite_all_title:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 96
    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/bg;->g:Landroid/view/View;

    sget v3, Lcom/facebook/i;->contact_picker_invite_all_subtitle:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 99
    iget-object v3, p0, Lcom/facebook/orca/contacts/picker/bg;->b:Lcom/facebook/prefs/shared/d;

    sget-object v4, Lcom/facebook/orca/prefs/o;->F:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v3, v4, v7}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v3

    .line 102
    if-nez v3, :cond_1

    iget v3, p0, Lcom/facebook/orca/contacts/picker/bg;->f:I

    if-lez v3, :cond_1

    .line 103
    iget v3, p0, Lcom/facebook/orca/contacts/picker/bg;->f:I

    if-ne v3, v5, :cond_0

    .line 104
    sget v3, Lcom/facebook/o;->divebar_invite_all_title_first_shown_one_contact:I

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 109
    :goto_0
    sget v1, Lcom/facebook/o;->divebar_invite_all_subtitle_first_shown:I

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(I)V

    .line 110
    sget v1, Lcom/facebook/o;->divebar_invite_all_button_label_first_shown:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 116
    :goto_1
    return-void

    .line 106
    :cond_0
    iget-object v3, p0, Lcom/facebook/orca/contacts/picker/bg;->h:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/facebook/o;->divebar_invite_all_title_first_shown:I

    new-array v5, v5, [Ljava/lang/Object;

    iget v6, p0, Lcom/facebook/orca/contacts/picker/bg;->f:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 112
    :cond_1
    sget v3, Lcom/facebook/o;->divebar_invite_all_title:I

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 113
    sget v1, Lcom/facebook/o;->divebar_invite_all_subtitle:I

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(I)V

    .line 114
    sget v1, Lcom/facebook/o;->divebar_invite_all_button_label:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    goto :goto_1
.end method

.method public a()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 68
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bg;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 74
    :goto_0
    return v0

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bg;->d:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bg;->e:Landroid/view/View$OnClickListener;

    if-nez v0, :cond_2

    .line 71
    :cond_1
    sget-object v0, Lcom/facebook/orca/contacts/picker/bg;->a:Ljava/lang/Class;

    const-string v2, "InviteAllViewController was not properly initialized!"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    move v0, v1

    .line 72
    goto :goto_0

    .line 74
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b()V
    .locals 5

    .prologue
    const/4 v4, 0x4

    .line 123
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bg;->g:Landroid/view/View;

    sget v1, Lcom/facebook/i;->contact_picker_invite_all_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 125
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/bg;->g:Landroid/view/View;

    sget v2, Lcom/facebook/i;->contact_picker_invite_all_subtitle:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 127
    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/bg;->g:Landroid/view/View;

    sget v3, Lcom/facebook/i;->contact_picker_invite_all_buttons:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    .line 130
    sget v3, Lcom/facebook/o;->divebar_invite_all_invites_sent:I

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    .line 131
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 132
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 134
    new-instance v0, Lcom/facebook/orca/contacts/picker/bh;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/picker/bh;-><init>(Lcom/facebook/orca/contacts/picker/bg;)V

    .line 141
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 142
    const-wide/16 v2, 0x7d0

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 143
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bg;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 147
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bg;->h:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 148
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bg;->i:Lcom/facebook/contacts/picker/q;

    invoke-interface {v0}, Lcom/facebook/contacts/picker/q;->a()V

    .line 149
    return-void
.end method
