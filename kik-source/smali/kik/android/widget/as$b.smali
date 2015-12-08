.class final Lkik/android/widget/as$b;
.super Landroid/support/v7/widget/RecyclerView$t;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/widget/as;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field j:Landroid/widget/ImageView;

.field private k:Lkik/android/widget/GifSearchFragment$b;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 1

    .prologue
    .line 276
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$t;-><init>(Landroid/view/View;)V

    .line 277
    iput-object p1, p0, Lkik/android/widget/as$b;->j:Landroid/widget/ImageView;

    .line 278
    iget-object v0, p0, Lkik/android/widget/as$b;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 279
    return-void
.end method

.method static synthetic a(Lkik/android/widget/as$b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 268
    iput-object p1, p0, Lkik/android/widget/as$b;->l:Ljava/lang/String;

    iput-object p2, p0, Lkik/android/widget/as$b;->m:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lkik/android/widget/as$b;Lkik/android/widget/GifSearchFragment$b;)V
    .locals 0

    .prologue
    .line 268
    iput-object p1, p0, Lkik/android/widget/as$b;->k:Lkik/android/widget/GifSearchFragment$b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 294
    iget-object v0, p0, Lkik/android/widget/as$b;->k:Lkik/android/widget/GifSearchFragment$b;

    iget-object v1, p0, Lkik/android/widget/as$b;->l:Ljava/lang/String;

    iget-object v2, p0, Lkik/android/widget/as$b;->m:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lkik/android/widget/GifSearchFragment$b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    return-void
.end method
