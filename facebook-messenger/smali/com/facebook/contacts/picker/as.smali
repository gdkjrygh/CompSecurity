.class public Lcom/facebook/contacts/picker/as;
.super Lcom/facebook/widget/f;
.source "SearchableContactPickerView.java"


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
.field private b:Lcom/facebook/contacts/picker/ak;

.field private c:Lcom/facebook/contacts/picker/c;

.field private d:Lcom/facebook/widget/a/h;

.field private e:Landroid/view/View;

.field private f:Landroid/view/View;

.field private g:Landroid/widget/EditText;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/view/View;

.field private j:Landroid/view/ViewGroup;

.field private k:Lcom/facebook/contacts/picker/ba;

.field private l:Landroid/view/View$OnFocusChangeListener;

.field private m:Lcom/facebook/contacts/picker/bc;

.field private n:Lcom/facebook/contacts/picker/bb;

.field private o:Lcom/facebook/contacts/picker/ar;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/facebook/contacts/picker/as;

    sput-object v0, Lcom/facebook/contacts/picker/as;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/contacts/picker/c;I)V
    .locals 3

    .prologue
    .line 87
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 76
    sget-object v0, Lcom/facebook/contacts/picker/ar;->NONE:Lcom/facebook/contacts/picker/ar;

    iput-object v0, p0, Lcom/facebook/contacts/picker/as;->o:Lcom/facebook/contacts/picker/ar;

    .line 88
    iput-object p2, p0, Lcom/facebook/contacts/picker/as;->c:Lcom/facebook/contacts/picker/c;

    .line 89
    new-instance v0, Lcom/facebook/contacts/picker/ak;

    invoke-direct {v0, p1, p2, p3}, Lcom/facebook/contacts/picker/ak;-><init>(Landroid/content/Context;Lcom/facebook/contacts/picker/b;I)V

    iput-object v0, p0, Lcom/facebook/contacts/picker/as;->b:Lcom/facebook/contacts/picker/ak;

    .line 90
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->b:Lcom/facebook/contacts/picker/ak;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/picker/as;->addView(Landroid/view/View;)V

    .line 92
    sget v0, Lcom/facebook/i;->friends_list_mask:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/picker/as;->getViewRequired(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/picker/as;->f:Landroid/view/View;

    .line 93
    sget v0, Lcom/facebook/i;->friends_list_search:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/picker/as;->getViewRequired(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    .line 94
    sget v0, Lcom/facebook/i;->contact_picker_search_section:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/picker/as;->getViewRequired(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/contacts/picker/as;->j:Landroid/view/ViewGroup;

    .line 95
    sget v0, Lcom/facebook/i;->dummy_focus_elt:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/picker/as;->getViewRequired(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/picker/as;->e:Landroid/view/View;

    .line 96
    sget v0, Lcom/facebook/i;->contact_picker_search_magnifier:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/picker/as;->getViewRequired(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/contacts/picker/as;->h:Landroid/widget/ImageView;

    .line 97
    sget v0, Lcom/facebook/i;->contact_picker_search_progress:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/picker/as;->getViewRequired(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/picker/as;->i:Landroid/view/View;

    .line 99
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->b:Lcom/facebook/contacts/picker/ak;

    new-instance v1, Lcom/facebook/contacts/picker/at;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/picker/at;-><init>(Lcom/facebook/contacts/picker/as;)V

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/picker/ak;->setOnContactListScrollListener(Lcom/facebook/contacts/picker/ap;)V

    .line 107
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    new-instance v1, Lcom/facebook/contacts/picker/au;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/picker/au;-><init>(Lcom/facebook/contacts/picker/as;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 113
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    new-instance v1, Lcom/facebook/contacts/picker/av;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/picker/av;-><init>(Lcom/facebook/contacts/picker/as;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 128
    iget-object v1, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    invoke-virtual {p0}, Lcom/facebook/contacts/picker/as;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v2, Lcom/facebook/analytics/bp;

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextWatcher;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 130
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->f:Landroid/view/View;

    new-instance v1, Lcom/facebook/contacts/picker/aw;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/picker/aw;-><init>(Lcom/facebook/contacts/picker/as;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 137
    invoke-virtual {p0}, Lcom/facebook/contacts/picker/as;->b()V

    .line 139
    new-instance v0, Lcom/facebook/contacts/picker/ax;

    invoke-direct {v0, p0}, Lcom/facebook/contacts/picker/ax;-><init>(Lcom/facebook/contacts/picker/as;)V

    iput-object v0, p0, Lcom/facebook/contacts/picker/as;->d:Lcom/facebook/widget/a/h;

    .line 151
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->h:Landroid/widget/ImageView;

    new-instance v1, Lcom/facebook/contacts/picker/ay;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/picker/ay;-><init>(Lcom/facebook/contacts/picker/as;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    return-void
.end method

.method private a(I)V
    .locals 3

    .prologue
    .line 282
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 283
    invoke-virtual {p0}, Lcom/facebook/contacts/picker/as;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 285
    iget-object v1, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 287
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/picker/as;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/facebook/contacts/picker/as;->f()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/picker/as;I)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/facebook/contacts/picker/as;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/picker/as;Lcom/facebook/widget/a/j;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/facebook/contacts/picker/as;->a(Lcom/facebook/widget/a/j;)V

    return-void
.end method

.method private a(Lcom/facebook/widget/a/j;)V
    .locals 3

    .prologue
    const/4 v2, 0x4

    const/4 v1, 0x0

    .line 325
    sget-object v0, Lcom/facebook/widget/a/j;->FILTERING:Lcom/facebook/widget/a/j;

    if-ne p1, v0, :cond_0

    .line 326
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 327
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->i:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 332
    :goto_0
    return-void

    .line 329
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 330
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->i:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method private a(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 357
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 358
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 359
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 360
    invoke-virtual {p0}, Lcom/facebook/contacts/picker/as;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "input_method"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 362
    iget-object v2, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 363
    const/4 v0, 0x1

    .line 365
    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/contacts/picker/as;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/facebook/contacts/picker/as;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/contacts/picker/as;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    return-object v0
.end method

.method private b(I)V
    .locals 2

    .prologue
    .line 309
    sget-object v0, Lcom/facebook/contacts/picker/as;->a:Ljava/lang/Class;

    const-string v1, "Filtering complete"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 310
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 311
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 312
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->b:Lcom/facebook/contacts/picker/ak;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ak;->a()V

    .line 313
    sget-object v0, Lcom/facebook/contacts/picker/ar;->UNFILTERED:Lcom/facebook/contacts/picker/ar;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/picker/as;->a(Lcom/facebook/contacts/picker/ar;)V

    .line 321
    :goto_0
    invoke-direct {p0}, Lcom/facebook/contacts/picker/as;->g()V

    .line 322
    return-void

    .line 314
    :cond_0
    if-nez p1, :cond_1

    .line 315
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->b:Lcom/facebook/contacts/picker/ak;

    sget-object v1, Lcom/facebook/contacts/picker/ao;->NO_RESULTS:Lcom/facebook/contacts/picker/ao;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/picker/ak;->a(Lcom/facebook/contacts/picker/ao;)V

    .line 316
    sget-object v0, Lcom/facebook/contacts/picker/ar;->FILTERED:Lcom/facebook/contacts/picker/ar;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/picker/as;->a(Lcom/facebook/contacts/picker/ar;)V

    goto :goto_0

    .line 318
    :cond_1
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->b:Lcom/facebook/contacts/picker/ak;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ak;->a()V

    .line 319
    sget-object v0, Lcom/facebook/contacts/picker/ar;->FILTERED:Lcom/facebook/contacts/picker/ar;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/picker/as;->a(Lcom/facebook/contacts/picker/ar;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/contacts/picker/as;I)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/facebook/contacts/picker/as;->b(I)V

    return-void
.end method

.method private f()V
    .locals 4

    .prologue
    .line 335
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->c:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/c;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    .line 337
    iget-object v1, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 338
    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 339
    sget-object v2, Lcom/facebook/contacts/picker/as;->a:Ljava/lang/Class;

    const-string v3, "Empty search"

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 340
    sget-object v2, Lcom/facebook/contacts/picker/ar;->UNFILTERED:Lcom/facebook/contacts/picker/ar;

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/picker/as;->a(Lcom/facebook/contacts/picker/ar;)V

    .line 341
    invoke-direct {p0}, Lcom/facebook/contacts/picker/as;->g()V

    .line 342
    const/4 v2, 0x0

    invoke-interface {v0, v2}, Lcom/facebook/contacts/picker/u;->a(Ljava/lang/CharSequence;)V

    .line 343
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->c:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/c;->getCount()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/picker/as;->b(I)V

    .line 344
    sget-object v0, Lcom/facebook/widget/a/j;->FINISHED:Lcom/facebook/widget/a/j;

    invoke-direct {p0, v0}, Lcom/facebook/contacts/picker/as;->a(Lcom/facebook/widget/a/j;)V

    .line 351
    :goto_0
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->n:Lcom/facebook/contacts/picker/bb;

    if-eqz v0, :cond_0

    .line 352
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->n:Lcom/facebook/contacts/picker/bb;

    invoke-interface {v0, v1}, Lcom/facebook/contacts/picker/bb;->a(Ljava/lang/String;)V

    .line 354
    :cond_0
    return-void

    .line 346
    :cond_1
    sget-object v2, Lcom/facebook/contacts/picker/as;->a:Ljava/lang/Class;

    const-string v3, "Performing filtering"

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 347
    sget-object v2, Lcom/facebook/contacts/picker/ar;->FILTERING:Lcom/facebook/contacts/picker/ar;

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/picker/as;->a(Lcom/facebook/contacts/picker/ar;)V

    .line 348
    iget-object v2, p0, Lcom/facebook/contacts/picker/as;->d:Lcom/facebook/widget/a/h;

    invoke-interface {v0, v1, v2}, Lcom/facebook/contacts/picker/u;->a(Ljava/lang/CharSequence;Lcom/facebook/widget/a/h;)V

    goto :goto_0
.end method

.method private g()V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 377
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 387
    :goto_0
    iget-object v3, p0, Lcom/facebook/contacts/picker/as;->b:Lcom/facebook/contacts/picker/ak;

    invoke-virtual {v3}, Lcom/facebook/contacts/picker/ak;->getListView()Landroid/widget/ListView;

    move-result-object v3

    .line 388
    if-eqz v0, :cond_3

    .line 389
    invoke-virtual {v3, v1}, Landroid/widget/ListView;->setEnabled(Z)V

    .line 390
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->f:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 395
    :goto_1
    return-void

    .line 379
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->o:Lcom/facebook/contacts/picker/ar;

    sget-object v3, Lcom/facebook/contacts/picker/ar;->FILTERING:Lcom/facebook/contacts/picker/ar;

    if-ne v0, v3, :cond_1

    move v0, v2

    .line 380
    goto :goto_0

    .line 381
    :cond_1
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->o:Lcom/facebook/contacts/picker/ar;

    sget-object v3, Lcom/facebook/contacts/picker/ar;->FILTERED:Lcom/facebook/contacts/picker/ar;

    if-ne v0, v3, :cond_2

    move v0, v1

    .line 382
    goto :goto_0

    :cond_2
    move v0, v2

    .line 384
    goto :goto_0

    .line 392
    :cond_3
    invoke-virtual {v3, v2}, Landroid/widget/ListView;->setEnabled(Z)V

    .line 393
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->f:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 168
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->b:Lcom/facebook/contacts/picker/ak;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ak;->getListView()Landroid/widget/ListView;

    move-result-object v0

    .line 171
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEnabled(Z)V

    .line 172
    invoke-virtual {v0}, Landroid/widget/ListView;->requestFocus()Z

    .line 175
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->f:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 177
    :cond_0
    return-void
.end method

.method protected a(Landroid/view/View;Z)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 290
    sget-object v2, Lcom/facebook/contacts/picker/as;->a:Ljava/lang/Class;

    const-string v3, "Search box focus changed: %d"

    new-array v4, v0, [Ljava/lang/Object;

    if-eqz p2, :cond_2

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v1

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->l:Landroid/view/View$OnFocusChangeListener;

    if-eqz v0, :cond_0

    .line 292
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->l:Landroid/view/View$OnFocusChangeListener;

    invoke-interface {v0, p1, p2}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    .line 294
    :cond_0
    if-nez p2, :cond_3

    .line 295
    sget-object v0, Lcom/facebook/contacts/picker/ar;->NONE:Lcom/facebook/contacts/picker/ar;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/picker/as;->a(Lcom/facebook/contacts/picker/ar;)V

    .line 296
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->c:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/c;->b()V

    .line 305
    :cond_1
    :goto_1
    invoke-direct {p0}, Lcom/facebook/contacts/picker/as;->g()V

    .line 306
    return-void

    :cond_2
    move v0, v1

    .line 290
    goto :goto_0

    .line 298
    :cond_3
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->o:Lcom/facebook/contacts/picker/ar;

    sget-object v1, Lcom/facebook/contacts/picker/ar;->NONE:Lcom/facebook/contacts/picker/ar;

    if-ne v0, v1, :cond_1

    .line 299
    sget-object v0, Lcom/facebook/contacts/picker/ar;->UNFILTERED:Lcom/facebook/contacts/picker/ar;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/picker/as;->a(Lcom/facebook/contacts/picker/ar;)V

    .line 300
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->m:Lcom/facebook/contacts/picker/bc;

    if-eqz v0, :cond_1

    .line 301
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->m:Lcom/facebook/contacts/picker/bc;

    invoke-interface {v0}, Lcom/facebook/contacts/picker/bc;->a()V

    goto :goto_1
.end method

.method protected a(Lcom/facebook/contacts/picker/ar;)V
    .locals 1

    .prologue
    .line 369
    iput-object p1, p0, Lcom/facebook/contacts/picker/as;->o:Lcom/facebook/contacts/picker/ar;

    .line 370
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->k:Lcom/facebook/contacts/picker/ba;

    if-eqz v0, :cond_0

    .line 371
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->k:Lcom/facebook/contacts/picker/ba;

    invoke-interface {v0, p1}, Lcom/facebook/contacts/picker/ba;->a(Lcom/facebook/contacts/picker/ar;)V

    .line 373
    :cond_0
    return-void
.end method

.method public a(Lcom/google/common/a/es;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/picker/ad;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 236
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->b:Lcom/facebook/contacts/picker/ak;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/ak;->a(Lcom/google/common/a/es;)V

    .line 237
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->o:Lcom/facebook/contacts/picker/ar;

    sget-object v1, Lcom/facebook/contacts/picker/ar;->NONE:Lcom/facebook/contacts/picker/ar;

    if-eq v0, v1, :cond_0

    .line 238
    invoke-direct {p0}, Lcom/facebook/contacts/picker/as;->f()V

    .line 240
    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 247
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->b:Lcom/facebook/contacts/picker/ak;

    sget-object v1, Lcom/facebook/contacts/picker/ao;->LOADING:Lcom/facebook/contacts/picker/ao;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/picker/ak;->a(Lcom/facebook/contacts/picker/ao;)V

    .line 248
    return-void
.end method

.method public c()Z
    .locals 2

    .prologue
    .line 398
    sget-object v0, Lcom/facebook/contacts/picker/ar;->FILTERED:Lcom/facebook/contacts/picker/ar;

    iget-object v1, p0, Lcom/facebook/contacts/picker/as;->o:Lcom/facebook/contacts/picker/ar;

    if-eq v0, v1, :cond_0

    sget-object v0, Lcom/facebook/contacts/picker/ar;->FILTERING:Lcom/facebook/contacts/picker/ar;

    iget-object v1, p0, Lcom/facebook/contacts/picker/as;->o:Lcom/facebook/contacts/picker/ar;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 407
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 408
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 409
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 252
    invoke-super {p0, p1}, Lcom/facebook/widget/f;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    .line 253
    if-eqz v0, :cond_0

    .line 262
    :goto_0
    return v0

    .line 256
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    .line 257
    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 258
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 259
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 260
    const/4 v0, 0x1

    goto :goto_0

    .line 262
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 269
    invoke-virtual {p0}, Lcom/facebook/contacts/picker/as;->getSearchBoxText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 270
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 275
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 278
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/widget/f;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public e()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 416
    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/picker/as;->setSearchBoxText(Ljava/lang/String;)V

    .line 417
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 420
    invoke-virtual {p0}, Lcom/facebook/contacts/picker/as;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 422
    iget-object v1, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 423
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->b:Lcom/facebook/contacts/picker/ak;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ak;->getListView()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setSelection(I)V

    .line 424
    return-void
.end method

.method public getListView()Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 243
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->b:Lcom/facebook/contacts/picker/ak;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ak;->getListView()Landroid/widget/ListView;

    move-result-object v0

    return-object v0
.end method

.method public getSearchBoxText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 412
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 428
    invoke-virtual {p0}, Lcom/facebook/contacts/picker/as;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/g;->title_bar_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 429
    iget-object v1, p0, Lcom/facebook/contacts/picker/as;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 430
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 431
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 434
    invoke-direct {p0}, Lcom/facebook/contacts/picker/as;->f()V

    .line 435
    return-void
.end method

.method public setOnContactListScrollListener(Lcom/facebook/contacts/picker/ap;)V
    .locals 2

    .prologue
    .line 208
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->b:Lcom/facebook/contacts/picker/ak;

    new-instance v1, Lcom/facebook/contacts/picker/az;

    invoke-direct {v1, p0, p1}, Lcom/facebook/contacts/picker/az;-><init>(Lcom/facebook/contacts/picker/as;Lcom/facebook/contacts/picker/ap;)V

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/picker/ak;->setOnContactListScrollListener(Lcom/facebook/contacts/picker/ap;)V

    .line 216
    return-void
.end method

.method public setOnFilterStateChangedListener(Lcom/facebook/contacts/picker/ba;)V
    .locals 0

    .prologue
    .line 190
    iput-object p1, p0, Lcom/facebook/contacts/picker/as;->k:Lcom/facebook/contacts/picker/ba;

    .line 191
    return-void
.end method

.method public setOnRowClickedListener(Lcom/facebook/contacts/picker/aq;)V
    .locals 1

    .prologue
    .line 199
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->b:Lcom/facebook/contacts/picker/ak;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/ak;->setOnRowClickedListener(Lcom/facebook/contacts/picker/aq;)V

    .line 200
    return-void
.end method

.method public setOnSearchBoxFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .locals 0

    .prologue
    .line 219
    iput-object p1, p0, Lcom/facebook/contacts/picker/as;->l:Landroid/view/View$OnFocusChangeListener;

    .line 220
    return-void
.end method

.method public setSearchBoxText(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 403
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 404
    return-void
.end method

.method public setSearchHint(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/facebook/contacts/picker/as;->g:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 181
    return-void
.end method

.method public setSearchPerformedListener(Lcom/facebook/contacts/picker/bb;)V
    .locals 0

    .prologue
    .line 227
    iput-object p1, p0, Lcom/facebook/contacts/picker/as;->n:Lcom/facebook/contacts/picker/bb;

    .line 228
    return-void
.end method

.method public setSearchStartedListener(Lcom/facebook/contacts/picker/bc;)V
    .locals 0

    .prologue
    .line 223
    iput-object p1, p0, Lcom/facebook/contacts/picker/as;->m:Lcom/facebook/contacts/picker/bc;

    .line 224
    return-void
.end method
