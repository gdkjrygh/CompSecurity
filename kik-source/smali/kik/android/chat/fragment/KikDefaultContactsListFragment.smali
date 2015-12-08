.class public abstract Lkik/android/chat/fragment/KikDefaultContactsListFragment;
.super Lkik/android/chat/fragment/KikContactsListFragment;
.source "SourceFile"


# static fields
.field private static final V:Lorg/c/b;


# instance fields
.field protected L:Z

.field protected M:Lkik/android/util/ck;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected N:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected O:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation
.end field

.field private U:Z

.field private W:Landroid/widget/AdapterView$OnItemClickListener;

.field private X:Landroid/text/TextWatcher;

.field private Y:Landroid/view/View$OnClickListener;

.field private Z:Landroid/view/View$OnClickListener;

.field private a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 67
    const-string v0, "DefaultContactsList"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->V:Lorg/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 60
    invoke-direct {p0}, Lkik/android/chat/fragment/KikContactsListFragment;-><init>()V

    .line 66
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->L:Z

    .line 77
    new-instance v0, Lkik/android/chat/fragment/ks;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ks;-><init>(Lkik/android/chat/fragment/KikDefaultContactsListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->W:Landroid/widget/AdapterView$OnItemClickListener;

    .line 114
    new-instance v0, Lkik/android/chat/fragment/kt;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/kt;-><init>(Lkik/android/chat/fragment/KikDefaultContactsListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->X:Landroid/text/TextWatcher;

    .line 137
    new-instance v0, Lkik/android/chat/fragment/ku;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ku;-><init>(Lkik/android/chat/fragment/KikDefaultContactsListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->Y:Landroid/view/View$OnClickListener;

    .line 156
    new-instance v0, Lkik/android/chat/fragment/kv;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/kv;-><init>(Lkik/android/chat/fragment/KikDefaultContactsListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->Z:Landroid/view/View$OnClickListener;

    return-void
.end method

.method private Y()V
    .locals 2

    .prologue
    .line 449
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 450
    const-string v0, ""

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->b:Ljava/lang/String;

    .line 451
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->A:Z

    .line 452
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 454
    :cond_0
    return-void
.end method


# virtual methods
.method protected final R()Ljava/lang/String;
    .locals 2

    .prologue
    .line 497
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    if-eqz v0, :cond_0

    .line 498
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090014

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 500
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method protected final S()V
    .locals 2

    .prologue
    .line 442
    invoke-direct {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->Y()V

    .line 443
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->a(Ljava/lang/String;Z)V

    .line 444
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 445
    return-void
.end method

.method protected final T()Ljava/lang/String;
    .locals 1

    .prologue
    .line 519
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final a(Lkik/a/d/k;I)Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 462
    new-instance v0, Lkik/android/chat/fragment/KikContactsListFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikContactsListFragment$a;-><init>()V

    .line 463
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikContactsListFragment$a;->a(Landroid/os/Bundle;)V

    .line 464
    new-instance v1, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    .line 465
    invoke-virtual {v1, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v2

    const-string v3, "inline-username-search"

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v2

    invoke-virtual {v2, p2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(I)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v2

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikContactsListFragment$a;->h()I

    move-result v0

    invoke-virtual {v2, v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 469
    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    move-result-object v0

    .line 470
    invoke-direct {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->Y()V

    .line 471
    return-object v0
.end method

.method protected a(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 393
    invoke-virtual {p0, p1}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->d(Ljava/lang/String;)V

    .line 394
    invoke-super {p0, p1, p2}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Ljava/lang/String;Z)V

    .line 395
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->invalidateViews()V

    .line 396
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->m:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 397
    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->m:Landroid/view/View;

    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    const/16 v0, 0x8

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 399
    :cond_1
    return-void

    .line 397
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected abstract a(Lkik/a/d/k;)V
.end method

.method protected abstract a_(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method protected abstract b(Landroid/os/Bundle;)V
.end method

.method protected final b(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 404
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikContactsListFragment;->b(Ljava/lang/String;)V

    .line 406
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 408
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->a:Z

    if-eqz v0, :cond_0

    .line 409
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->a:Z

    .line 410
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->a(Landroid/view/View;I)V

    .line 411
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->a(Landroid/view/View;)V

    .line 414
    :cond_0
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->U:Z

    if-eqz v0, :cond_1

    .line 415
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->U:Z

    .line 416
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getCount()I

    move-result v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 417
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->a(Landroid/view/View;I)V

    .line 418
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->a(Landroid/view/View;)V

    .line 422
    :cond_1
    if-eqz p1, :cond_4

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->l:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 423
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->E:Ljava/util/Map;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-nez v0, :cond_3

    .line 424
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->l:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 434
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->z()V

    .line 435
    return-void

    .line 427
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->l:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 430
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->l:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 431
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->l:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method protected abstract b(Lkik/a/d/k;)V
.end method

.method protected final c(Lkik/a/d/k;)V
    .locals 4

    .prologue
    .line 526
    if-eqz p1, :cond_1

    .line 527
    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    .line 528
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    .line 529
    iget-object v2, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->N:Lcom/kik/android/a;

    const-string v3, "Premium Promoted Chat Click"

    invoke-virtual {v2, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Bots"

    invoke-virtual {v2, v3, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Is Contact"

    invoke-virtual {p1}, Lkik/a/d/k;->l()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/android/a$f;->b()V

    .line 534
    invoke-virtual {p1}, Lkik/a/d/k;->m()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lkik/a/d/k;->p()Z

    move-result v1

    if-nez v1, :cond_2

    .line 535
    :cond_0
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->a(Ljava/lang/String;)V

    .line 541
    :cond_1
    :goto_0
    return-void

    .line 538
    :cond_2
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected abstract d()Z
.end method

.method protected abstract f()Ljava/lang/String;
.end method

.method protected h()Ljava/lang/String;
    .locals 2

    .prologue
    .line 488
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    if-eqz v0, :cond_0

    .line 489
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900e8

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 491
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method protected k()Z
    .locals 1

    .prologue
    .line 387
    const/4 v0, 0x1

    return v0
.end method

.method protected l()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 505
    const/4 v0, 0x0

    return-object v0
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 360
    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/view/MenuItem;->getGroupId()I

    move-result v0

    const/16 v3, 0x4c7e

    if-eq v0, v3, :cond_1

    :cond_0
    move v0, v2

    .line 375
    :goto_0
    return v0

    .line 364
    :cond_1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/16 v3, 0x4c7f

    if-ne v0, v3, :cond_2

    .line 365
    invoke-interface {p1}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 366
    iget-object v3, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    iget v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-virtual {v3, v0}, Landroid/widget/ListView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/database/Cursor;

    .line 367
    if-eqz v0, :cond_2

    .line 369
    const-string v2, "suggest_intent_data_id"

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 370
    iget-object v2, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->H:Lkik/a/e/r;

    invoke-interface {v2, v0, v1}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 371
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->b(Lkik/a/d/k;)V

    move v0, v1

    .line 372
    goto :goto_0

    :cond_2
    move v0, v2

    .line 375
    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 170
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikDefaultContactsListFragment;)V

    .line 171
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikContactsListFragment;->onCreate(Landroid/os/Bundle;)V

    .line 175
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->setDefaultKeyMode(I)V

    .line 176
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const/16 v5, 0x8

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 182
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikContactsListFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 184
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->b(Landroid/os/Bundle;)V

    .line 187
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->L:Z

    if-eqz v0, :cond_7

    .line 188
    const v0, 0x7f030044

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    .line 201
    :goto_0
    iput-boolean v4, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->a:Z

    .line 203
    const v0, 0x7f0e0075

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->m:Landroid/view/View;

    .line 204
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->m:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->m:Landroid/view/View;

    new-instance v1, Lkik/android/chat/fragment/kw;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/kw;-><init>(Lkik/android/chat/fragment/KikDefaultContactsListFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 214
    :cond_0
    const v0, 0x7f0e003e

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->e:Landroid/widget/LinearLayout;

    .line 215
    const v0, 0x7f0e003f

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->p:Landroid/widget/TextView;

    .line 216
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 218
    const v0, 0x7f0e003d

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    .line 220
    const/16 v0, 0x9

    invoke-static {v0}, Lcom/kik/sdkutils/y;->b(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 221
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setOverscrollFooter(Landroid/graphics/drawable/Drawable;)V

    .line 224
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->W:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 226
    const v0, 0x7f030078

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->g:Landroid/view/View;

    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->g:Landroid/view/View;

    const v1, 0x7f0e018c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 229
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->o:Landroid/graphics/drawable/AnimationDrawable;

    .line 230
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->o:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 232
    const v0, 0x7f03006e

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->h:Landroid/view/View;

    .line 233
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->h:Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->Z:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 235
    const v0, 0x7f030075

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->i:Landroid/view/View;

    .line 236
    const v0, 0x7f030076

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->j:Landroid/view/View;

    .line 238
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->i:Landroid/view/View;

    const v1, 0x7f0e0188

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->q:Landroid/widget/TextView;

    .line 239
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->j:Landroid/view/View;

    const v1, 0x7f0e0189

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->r:Landroid/widget/TextView;

    .line 241
    const v0, 0x7f0e0041

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->l:Landroid/view/View;

    .line 243
    const v0, 0x7f03007a

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->k:Landroid/view/View;

    .line 244
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->k:Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->Y:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 246
    const v0, 0x7f03007c

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->n:Landroid/widget/TextView;

    .line 247
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->n:Landroid/widget/TextView;

    const v1, 0x7f0900e9

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->t()V

    .line 251
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->t:Landroid/widget/LinearLayout;

    .line 252
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 253
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->t:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 254
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->t:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->h:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 255
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->t:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->i:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 256
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->t:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->j:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 257
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->t:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->k:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 258
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->t:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->g:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 259
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1, v6, v4}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 261
    new-instance v0, Lkik/android/sdkutils/concurrent/c;

    const-string v1, ""

    iget-object v3, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->H:Lkik/a/e/r;

    invoke-direct {v0, v1, v3}, Lkik/android/sdkutils/concurrent/c;-><init>(Ljava/lang/String;Lkik/a/e/r;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->x:Lkik/android/sdkutils/concurrent/c;

    .line 262
    new-instance v0, Lkik/android/sdkutils/concurrent/d;

    const-string v1, ""

    iget-object v3, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->G:Lkik/a/e/l;

    invoke-direct {v0, v1, v3}, Lkik/android/sdkutils/concurrent/d;-><init>(Ljava/lang/String;Lkik/a/e/l;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->y:Lkik/android/sdkutils/concurrent/d;

    .line 266
    const v0, 0x7f0e0074

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    .line 268
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 270
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->X:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 272
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    new-instance v1, Lkik/android/chat/fragment/kx;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/kx;-><init>(Lkik/android/chat/fragment/KikDefaultContactsListFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 287
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    if-eqz v0, :cond_2

    .line 288
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    const-string v1, "AUTOMATION_TITLE_KIK_USERNAME"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 291
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    new-instance v1, Lkik/android/chat/fragment/ky;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ky;-><init>(Lkik/android/chat/fragment/KikDefaultContactsListFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 310
    const v0, 0x7f0e01d7

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 311
    const v1, 0x7f0e012f

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 312
    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    .line 313
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->d()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 314
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->l()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 315
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->l()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 317
    :cond_3
    new-instance v0, Lkik/android/chat/fragment/kz;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/kz;-><init>(Lkik/android/chat/fragment/KikDefaultContactsListFragment;)V

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 328
    :goto_1
    const-string v0, "AUTOMATION_EXPLICIT_SEARCH"

    invoke-static {v1, v0}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 331
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->b:Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_5

    .line 332
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 335
    :cond_5
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 336
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    new-instance v1, Lkik/android/chat/fragment/la;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/la;-><init>(Lkik/android/chat/fragment/KikDefaultContactsListFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    .line 354
    :cond_6
    return-object v2

    .line 191
    :cond_7
    instance-of v0, p0, Lkik/android/chat/fragment/KikComposeFragment;

    if-eqz v0, :cond_8

    .line 192
    const v0, 0x7f030009

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 194
    iget-object v1, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->M:Lkik/android/util/ck;

    sget-object v2, Lkik/android/util/ck$b;->a:Lkik/android/util/ck$b;

    invoke-virtual {v1, v2}, Lkik/android/util/ck;->a(Lkik/android/util/ck$b;)V

    move-object v2, v0

    goto/16 :goto_0

    .line 197
    :cond_8
    const v0, 0x7f030008

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    goto/16 :goto_0

    .line 326
    :cond_9
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 477
    invoke-super {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->onResume()V

    .line 478
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->U:Z

    .line 479
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 480
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->d(Ljava/lang/String;)V

    .line 481
    iget-object v0, p0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->s:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 483
    :cond_0
    return-void
.end method

.method protected final u()Z
    .locals 1

    .prologue
    .line 381
    const/4 v0, 0x1

    return v0
.end method
