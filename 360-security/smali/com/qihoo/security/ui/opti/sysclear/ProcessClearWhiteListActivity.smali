.class public Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;,
        Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;
    }
.end annotation


# static fields
.field private static final y:Ljava/lang/String;


# instance fields
.field private A:Landroid/widget/ListView;

.field private B:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private C:Landroid/view/View;

.field private D:Lcom/qihoo/security/opti/a/c;

.field private E:Z

.field private F:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private G:I

.field private H:Z

.field private I:Z

.field private J:Lcom/qihoo360/mobilesafe/b/g;

.field private K:I

.field private final L:Landroid/os/Handler;

.field private final M:Lcom/qihoo/security/opti/a/c$b;

.field private N:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/a/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private O:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/a/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private P:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/a/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private Q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference",
            "<",
            "Landroid/graphics/drawable/Drawable;",
            ">;>;"
        }
    .end annotation
.end field

.field private final R:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/qihoo/security/opti/a/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private z:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 56
    const-class v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->y:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 54
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 60
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->z:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    .line 61
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->A:Landroid/widget/ListView;

    .line 65
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->D:Lcom/qihoo/security/opti/a/c;

    .line 68
    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->E:Z

    .line 72
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->G:I

    .line 73
    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->H:Z

    .line 80
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->K:I

    .line 88
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->L:Landroid/os/Handler;

    .line 411
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$3;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->M:Lcom/qihoo/security/opti/a/c$b;

    .line 489
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->N:Ljava/util/List;

    .line 490
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->O:Ljava/util/List;

    .line 491
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->P:Ljava/util/List;

    .line 492
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->Q:Ljava/util/Map;

    .line 724
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$4;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$4;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->R:Ljava/util/Comparator;

    .line 760
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;I)I
    .locals 0

    .prologue
    .line 54
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->G:I

    return p1
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->N:Ljava/util/List;

    return-object v0
.end method

.method private a(Lcom/qihoo/security/opti/a/c$a;Landroid/widget/ImageView;)V
    .locals 6

    .prologue
    const v5, 0x7f0c0027

    const v3, 0x7f0c0026

    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 463
    iget-boolean v0, p1, Lcom/qihoo/security/opti/a/c$a;->c:Z

    if-nez v0, :cond_2

    .line 464
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->E:Z

    if-eqz v0, :cond_0

    .line 465
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->G:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->G:I

    .line 466
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->G:I

    if-lez v0, :cond_1

    .line 467
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->G:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {v1, v5, v2}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 473
    :cond_0
    :goto_0
    const v0, 0x7f0200b1

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 486
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->z:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->notifyDataSetChanged()V

    .line 487
    return-void

    .line 470
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 475
    :cond_2
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->E:Z

    if-eqz v0, :cond_3

    .line 476
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->G:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->G:I

    .line 477
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->G:I

    if-lez v0, :cond_4

    .line 478
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->G:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {v1, v5, v2}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 484
    :cond_3
    :goto_2
    const v0, 0x7f0200b8

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 481
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_2
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Lcom/qihoo/security/opti/a/c$a;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/opti/a/c$a;Landroid/widget/ImageView;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 54
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Z)Z
    .locals 0

    .prologue
    .line 54
    iput-boolean p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->I:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 54
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->c(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Z
    .locals 1

    .prologue
    .line 54
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->E:Z

    return v0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Z)Z
    .locals 0

    .prologue
    .line 54
    iput-boolean p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->E:Z

    return p1
.end method

.method private c(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 790
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->J:Lcom/qihoo360/mobilesafe/b/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/qihoo360/mobilesafe/b/g;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->C:Landroid/view/View;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Z)Z
    .locals 0

    .prologue
    .line 54
    iput-boolean p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->H:Z

    return p1
.end method

.method static synthetic d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/opti/a/c;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->D:Lcom/qihoo/security/opti/a/c;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->z:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->p()V

    return-void
.end method

.method static synthetic g(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Z
    .locals 1

    .prologue
    .line 54
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->I:Z

    return v0
.end method

.method static synthetic h(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)I
    .locals 1

    .prologue
    .line 54
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->K:I

    return v0
.end method

.method static synthetic i(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic j(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->A:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic k(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->O:Ljava/util/List;

    return-object v0
.end method

.method static synthetic l(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->L:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->P:Ljava/util/List;

    return-object v0
.end method

.method static synthetic n(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->Q:Ljava/util/Map;

    return-object v0
.end method

.method private o()V
    .locals 3

    .prologue
    .line 236
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 237
    const-string/jumbo v1, "white_list_type"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->K:I

    .line 238
    return-void
.end method

.method private p()V
    .locals 3

    .prologue
    .line 280
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->E:Z

    if-eqz v0, :cond_1

    .line 281
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->B:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0025

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 282
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0024

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Ljava/lang/String;)V

    .line 311
    :cond_0
    :goto_0
    return-void

    .line 299
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->B:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0022

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 300
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0021

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Ljava/lang/String;)V

    .line 301
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->N:Ljava/util/List;

    if-eqz v0, :cond_0

    goto :goto_0
.end method

.method private q()V
    .locals 3

    .prologue
    .line 314
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 315
    if-eqz v0, :cond_1

    .line 316
    iget-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->H:Z

    if-eqz v1, :cond_0

    .line 323
    const-string/jumbo v1, "has_changed"

    iget-boolean v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->H:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 325
    :cond_0
    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->setResult(ILandroid/content/Intent;)V

    .line 327
    :cond_1
    return-void
.end method

.method private r()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 344
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->E:Z

    if-eqz v0, :cond_2

    .line 345
    iput-boolean v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->E:Z

    .line 346
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0021

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Ljava/lang/String;)V

    .line 347
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0023

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 348
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->O:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 349
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 350
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/a/c$a;

    .line 351
    iget-boolean v2, v0, Lcom/qihoo/security/opti/a/c$a;->c:Z

    if-eqz v2, :cond_0

    .line 352
    iput-boolean v3, v0, Lcom/qihoo/security/opti/a/c$a;->c:Z

    goto :goto_0

    .line 355
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->z:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->notifyDataSetChanged()V

    .line 356
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->p()V

    .line 360
    :goto_1
    return-void

    .line 358
    :cond_2
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onBackPressed()V

    goto :goto_1
.end method


# virtual methods
.method public finish()V
    .locals 0

    .prologue
    .line 331
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->q()V

    .line 332
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->finish()V

    .line 333
    return-void
.end method

.method protected j()V
    .locals 2

    .prologue
    .line 242
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 243
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 244
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0021

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Ljava/lang/String;)V

    .line 246
    :cond_0
    return-void
.end method

.method protected n()V
    .locals 0

    .prologue
    .line 250
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->r()V

    .line 251
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 337
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->r()V

    .line 338
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/16 v3, 0x30

    .line 124
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 126
    const v0, 0x7f03009d

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->setContentView(I)V

    .line 127
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o()V

    .line 128
    const v0, 0x7f0b009b

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->C:Landroid/view/View;

    .line 129
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->C:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 131
    const v0, 0x7f0b0146

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->A:Landroid/widget/ListView;

    .line 132
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->A:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 133
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->A:Landroid/widget/ListView;

    const v1, 0x7f0b0094

    invoke-virtual {p0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 135
    const v0, 0x7f0b0077

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->B:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 137
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->N:Ljava/util/List;

    .line 138
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->O:Ljava/util/List;

    .line 139
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->P:Ljava/util/List;

    .line 140
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->Q:Ljava/util/Map;

    .line 142
    new-instance v0, Lcom/qihoo/security/opti/a/c;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->p:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/opti/a/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->D:Lcom/qihoo/security/opti/a/c;

    .line 143
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->D:Lcom/qihoo/security/opti/a/c;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->M:Lcom/qihoo/security/opti/a/c$b;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/a/c;->a(Lcom/qihoo/security/opti/a/c$b;)V

    .line 144
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->D:Lcom/qihoo/security/opti/a/c;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/a/c;->a()V

    .line 145
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->p:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->D:Lcom/qihoo/security/opti/a/c;

    invoke-virtual {v2}, Lcom/qihoo/security/opti/a/c;->c()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->z:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    .line 146
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->A:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->z:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 148
    new-instance v0, Lcom/qihoo360/mobilesafe/b/g;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->p:Landroid/content/Context;

    invoke-direct {v0, v1, v3, v3}, Lcom/qihoo360/mobilesafe/b/g;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->J:Lcom/qihoo360/mobilesafe/b/g;

    .line 150
    const v0, 0x7f0b00f6

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 151
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080056

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/c;->a(Landroid/view/View;I)V

    .line 152
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0023

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 153
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 233
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 380
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onDestroy()V

    .line 382
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->D:Lcom/qihoo/security/opti/a/c;

    if-eqz v0, :cond_0

    .line 383
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->D:Lcom/qihoo/security/opti/a/c;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/a/c;->b()V

    .line 386
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->N:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 387
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 388
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->N:Ljava/util/List;

    .line 391
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->O:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 392
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->O:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 393
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->O:Ljava/util/List;

    .line 396
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->P:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 397
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 398
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->P:Ljava/util/List;

    .line 401
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->Q:Ljava/util/Map;

    if-eqz v0, :cond_4

    .line 402
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->Q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 403
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->Q:Ljava/util/Map;

    .line 406
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->J:Lcom/qihoo360/mobilesafe/b/g;

    if-eqz v0, :cond_5

    .line 407
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->J:Lcom/qihoo360/mobilesafe/b/g;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/b/g;->a()V

    .line 409
    :cond_5
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 444
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->E:Z

    if-nez v0, :cond_1

    .line 460
    :cond_0
    :goto_0
    return-void

    .line 448
    :cond_1
    if-ltz p3, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->z:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->getCount()I

    move-result v0

    if-ge p3, v0, :cond_0

    .line 451
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->z:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    invoke-virtual {v0, p3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a(I)Lcom/qihoo/security/opti/a/c$a;

    move-result-object v1

    .line 452
    iget-object v0, v1, Lcom/qihoo/security/opti/a/c$a;->a:Ljava/lang/String;

    const-string/jumbo v2, "com.qihoo.security.lite"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 456
    iget-boolean v0, v1, Lcom/qihoo/security/opti/a/c$a;->c:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, v1, Lcom/qihoo/security/opti/a/c$a;->c:Z

    .line 458
    const v0, 0x7f0b020f

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 459
    invoke-direct {p0, v1, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/opti/a/c$a;Landroid/widget/ImageView;)V

    goto :goto_0

    .line 456
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 364
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onPause()V

    .line 365
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->D:Lcom/qihoo/security/opti/a/c;

    if-eqz v0, :cond_0

    .line 366
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->D:Lcom/qihoo/security/opti/a/c;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/a/c;->d()V

    .line 368
    :cond_0
    return-void
.end method

.method public onStop()V
    .locals 0

    .prologue
    .line 372
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onStop()V

    .line 376
    return-void
.end method
