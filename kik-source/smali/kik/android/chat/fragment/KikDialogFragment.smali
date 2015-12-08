.class public Lkik/android/chat/fragment/KikDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikDialogFragment$b;,
        Lkik/android/chat/fragment/KikDialogFragment$a;,
        Lkik/android/chat/fragment/KikDialogFragment$c;
    }
.end annotation


# static fields
.field private static f:I


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:Ljava/lang/String;

.field protected c:Lkik/android/chat/fragment/KikDialogFragment$b;

.field protected d:Lkik/android/chat/fragment/KikDialogFragment$b;

.field protected e:Lkik/android/chat/fragment/KikDialogFragment$b;

.field private final g:I

.field private final h:Lcom/kik/g/p;

.field private i:Landroid/content/res/Resources;

.field private j:Ljava/util/Vector;

.field private k:Lkik/android/chat/fragment/KikDialogFragment$c;

.field private l:Landroid/view/View;

.field private m:[Ljava/lang/CharSequence;

.field private n:[Ljava/lang/CharSequence;

.field private o:I

.field private p:Landroid/content/DialogInterface$OnClickListener;

.field private q:Landroid/content/DialogInterface$OnCancelListener;

.field private r:Z

.field private s:I

.field private t:I

.field private u:Lcom/kik/g/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const/4 v0, 0x1

    sput v0, Lkik/android/chat/fragment/KikDialogFragment;->f:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 53
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 30
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->h:Lcom/kik/g/p;

    .line 33
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->j:Ljava/util/Vector;

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->k:Lkik/android/chat/fragment/KikDialogFragment$c;

    .line 48
    iput v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->s:I

    .line 49
    iput v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->t:I

    .line 54
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->r:Z

    .line 55
    sget v0, Lkik/android/chat/fragment/KikDialogFragment;->f:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lkik/android/chat/fragment/KikDialogFragment;->f:I

    iput v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->g:I

    .line 56
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->u:Lcom/kik/g/p;

    .line 57
    return-void
.end method

.method private static a(Landroid/widget/TextView;)V
    .locals 1

    .prologue
    .line 337
    if-eqz p0, :cond_0

    .line 338
    const/16 v0, 0xf

    invoke-static {p0, v0}, Landroid/text/util/Linkify;->addLinks(Landroid/widget/TextView;I)Z

    .line 339
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 341
    :cond_0
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikDialogFragment;Landroid/content/res/Resources;)V
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lkik/android/chat/fragment/KikDialogFragment;->i:Landroid/content/res/Resources;

    return-void
.end method

.method private e()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 326
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->k:Lkik/android/chat/fragment/KikDialogFragment$c;

    if-eqz v0, :cond_0

    .line 327
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->k:Lkik/android/chat/fragment/KikDialogFragment$c;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment$c;->a()V

    .line 331
    :cond_0
    iput-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->k:Lkik/android/chat/fragment/KikDialogFragment$c;

    .line 332
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->h:Lcom/kik/g/p;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 333
    return-void
.end method

.method private f()V
    .locals 1

    .prologue
    .line 393
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->u:Lcom/kik/g/p;

    if-eqz v0, :cond_0

    .line 394
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->u:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 395
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->u:Lcom/kik/g/p;

    .line 397
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 110
    const v0, 0x7f0e00f1

    iput v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->s:I

    .line 111
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 102
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->i:Landroid/content/res/Resources;

    if-nez v0, :cond_0

    .line 103
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Please dialog must be initialized with resource to use resource identifiers"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 105
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->i:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->a:Ljava/lang/String;

    .line 106
    return-void
.end method

.method public final a(ILandroid/content/DialogInterface$OnClickListener;)V
    .locals 2

    .prologue
    .line 157
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->i:Landroid/content/res/Resources;

    if-nez v0, :cond_0

    .line 158
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Please dialog must be initialized with resource to use resource identifiers"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 161
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->i:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lkik/android/chat/fragment/KikDialogFragment;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    .line 162
    return-void
.end method

.method public a(Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lkik/android/chat/fragment/KikDialogFragment;->q:Landroid/content/DialogInterface$OnCancelListener;

    .line 93
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lkik/android/chat/fragment/KikDialogFragment;->l:Landroid/view/View;

    .line 153
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lkik/android/chat/fragment/KikDialogFragment;->a:Ljava/lang/String;

    .line 98
    return-void
.end method

.method public final a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .prologue
    .line 172
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/KikDialogFragment$b;-><init>(Lkik/android/chat/fragment/KikDialogFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->c:Lkik/android/chat/fragment/KikDialogFragment$b;

    .line 173
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->c:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v0, p2}, Lkik/android/chat/fragment/KikDialogFragment$b;->a(Landroid/content/DialogInterface$OnClickListener;)V

    .line 174
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->c:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikDialogFragment$b;->a(Ljava/lang/String;)V

    .line 175
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikDialogFragment$c;)V
    .locals 0

    .prologue
    .line 314
    iput-object p1, p0, Lkik/android/chat/fragment/KikDialogFragment;->k:Lkik/android/chat/fragment/KikDialogFragment$c;

    .line 315
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 166
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->setCancelable(Z)V

    .line 167
    iput-boolean p1, p0, Lkik/android/chat/fragment/KikDialogFragment;->r:Z

    .line 168
    return-void
.end method

.method public final a([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 0

    .prologue
    .line 211
    iput-object p1, p0, Lkik/android/chat/fragment/KikDialogFragment;->m:[Ljava/lang/CharSequence;

    .line 212
    iput-object p2, p0, Lkik/android/chat/fragment/KikDialogFragment;->p:Landroid/content/DialogInterface$OnClickListener;

    .line 213
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 115
    const v0, 0x102000b

    iput v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->t:I

    .line 116
    return-void
.end method

.method public final b(I)V
    .locals 2

    .prologue
    .line 125
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->i:Landroid/content/res/Resources;

    if-nez v0, :cond_0

    .line 126
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Please dialog must be initialized with resource to use resource identifiers"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 128
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->i:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->b:Ljava/lang/String;

    .line 129
    return-void
.end method

.method public final b(ILandroid/content/DialogInterface$OnClickListener;)V
    .locals 2

    .prologue
    .line 179
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->i:Landroid/content/res/Resources;

    if-nez v0, :cond_0

    .line 180
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Please dialog must be initialized with resource to use resource identifiers"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 183
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->i:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lkik/android/chat/fragment/KikDialogFragment;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    .line 184
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lkik/android/chat/fragment/KikDialogFragment;->b:Ljava/lang/String;

    .line 121
    return-void
.end method

.method public final b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .prologue
    .line 188
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/KikDialogFragment$b;-><init>(Lkik/android/chat/fragment/KikDialogFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment$b;

    .line 189
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v0, p2}, Lkik/android/chat/fragment/KikDialogFragment$b;->a(Landroid/content/DialogInterface$OnClickListener;)V

    .line 190
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikDialogFragment$b;->a(Ljava/lang/String;)V

    .line 191
    return-void
.end method

.method public final b([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .prologue
    .line 217
    iput-object p1, p0, Lkik/android/chat/fragment/KikDialogFragment;->n:[Ljava/lang/CharSequence;

    .line 218
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->o:I

    .line 219
    iput-object p2, p0, Lkik/android/chat/fragment/KikDialogFragment;->p:Landroid/content/DialogInterface$OnClickListener;

    .line 220
    return-void
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 224
    iget v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->g:I

    return v0
.end method

.method public final c(ILandroid/content/DialogInterface$OnClickListener;)V
    .locals 2

    .prologue
    .line 195
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->i:Landroid/content/res/Resources;

    if-nez v0, :cond_0

    .line 196
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Please dialog must be initialized with resource to use resource identifiers"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 199
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->i:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lkik/android/chat/fragment/KikDialogFragment;->c(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    .line 200
    return-void
.end method

.method public final c(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .prologue
    .line 204
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/KikDialogFragment$b;-><init>(Lkik/android/chat/fragment/KikDialogFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->e:Lkik/android/chat/fragment/KikDialogFragment$b;

    .line 205
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->e:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v0, p2}, Lkik/android/chat/fragment/KikDialogFragment$b;->a(Landroid/content/DialogInterface$OnClickListener;)V

    .line 206
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->e:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikDialogFragment$b;->a(Ljava/lang/String;)V

    .line 207
    return-void
.end method

.method public final d()Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->h:Lcom/kik/g/p;

    return-object v0
.end method

.method public dismiss()V
    .locals 0

    .prologue
    .line 376
    invoke-direct {p0}, Lkik/android/chat/fragment/KikDialogFragment;->f()V

    .line 377
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->dismiss()V

    .line 378
    return-void
.end method

.method public dismissAllowingStateLoss()V
    .locals 1

    .prologue
    .line 384
    invoke-direct {p0}, Lkik/android/chat/fragment/KikDialogFragment;->f()V

    .line 386
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDialogFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 387
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 389
    :cond_0
    return-void
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 402
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->h:Lcom/kik/g/p;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 403
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->q:Landroid/content/DialogInterface$OnCancelListener;

    if-eqz v0, :cond_0

    .line 404
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->q:Landroid/content/DialogInterface$OnCancelListener;

    invoke-interface {v0, p1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V

    .line 406
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCancel(Landroid/content/DialogInterface;)V

    .line 407
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 72
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 73
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    .prologue
    .line 250
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 252
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 253
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 256
    :cond_0
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 257
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 260
    :cond_1
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->l:Landroid/view/View;

    if-eqz v1, :cond_2

    .line 261
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->l:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 264
    :cond_2
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->c:Lkik/android/chat/fragment/KikDialogFragment$b;

    if-eqz v1, :cond_3

    .line 265
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->c:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikDialogFragment$b;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikDialogFragment;->c:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikDialogFragment$b;->b()Landroid/content/DialogInterface$OnClickListener;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 268
    :cond_3
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment$b;

    if-eqz v1, :cond_4

    .line 269
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikDialogFragment$b;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikDialogFragment$b;->b()Landroid/content/DialogInterface$OnClickListener;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 272
    :cond_4
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->e:Lkik/android/chat/fragment/KikDialogFragment$b;

    if-eqz v1, :cond_5

    .line 273
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->e:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikDialogFragment$b;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikDialogFragment;->e:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikDialogFragment$b;->b()Landroid/content/DialogInterface$OnClickListener;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 276
    :cond_5
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->m:[Ljava/lang/CharSequence;

    if-eqz v1, :cond_6

    .line 277
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->m:[Ljava/lang/CharSequence;

    iget-object v2, p0, Lkik/android/chat/fragment/KikDialogFragment;->p:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 280
    :cond_6
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->n:[Ljava/lang/CharSequence;

    if-eqz v1, :cond_7

    .line 281
    iget-object v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->n:[Ljava/lang/CharSequence;

    iget v2, p0, Lkik/android/chat/fragment/KikDialogFragment;->o:I

    iget-object v3, p0, Lkik/android/chat/fragment/KikDialogFragment;->p:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {v0, v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 284
    :cond_7
    iget-boolean v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->r:Z

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 286
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 287
    if-eqz v1, :cond_8

    .line 289
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->r:Z

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 293
    :cond_8
    iget v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->s:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_9

    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->l:Landroid/view/View;

    if-eqz v0, :cond_9

    .line 294
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->l:Landroid/view/View;

    iget v2, p0, Lkik/android/chat/fragment/KikDialogFragment;->s:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lkik/android/chat/fragment/KikDialogFragment;->a(Landroid/widget/TextView;)V

    .line 297
    :cond_9
    return-object v1
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 363
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onDestroy()V

    .line 366
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    if-nez v0, :cond_0

    .line 367
    invoke-direct {p0}, Lkik/android/chat/fragment/KikDialogFragment;->e()V

    .line 369
    :cond_0
    invoke-direct {p0}, Lkik/android/chat/fragment/KikDialogFragment;->f()V

    .line 370
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .prologue
    .line 320
    invoke-direct {p0}, Lkik/android/chat/fragment/KikDialogFragment;->e()V

    .line 321
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 322
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 235
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onResume()V

    .line 237
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->j:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 238
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 240
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->j:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    .line 242
    iget-object v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->h:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 243
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDialogFragment;->dismiss()V

    .line 245
    :cond_1
    return-void
.end method

.method public onStart()V
    .locals 2

    .prologue
    .line 303
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onStart()V

    .line 307
    iget v0, p0, Lkik/android/chat/fragment/KikDialogFragment;->t:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 308
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    iget v1, p0, Lkik/android/chat/fragment/KikDialogFragment;->t:I

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lkik/android/chat/fragment/KikDialogFragment;->a(Landroid/widget/TextView;)V

    .line 310
    :cond_0
    return-void
.end method
