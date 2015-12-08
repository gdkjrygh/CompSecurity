.class abstract Lcom/kik/cards/usermedia/CustomGalleryActivity$a;
.super Landroid/widget/CursorAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cards/usermedia/CustomGalleryActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;
    }
.end annotation


# instance fields
.field protected a:I

.field final synthetic b:Lcom/kik/cards/usermedia/CustomGalleryActivity;


# direct methods
.method public constructor <init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;Landroid/content/Context;Landroid/database/Cursor;I)V
    .locals 0

    .prologue
    .line 299
    iput-object p1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a;->b:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    .line 300
    invoke-direct {p0, p2, p3}, Landroid/widget/CursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;)V

    .line 301
    invoke-virtual {p0, p4}, Lcom/kik/cards/usermedia/CustomGalleryActivity$a;->a(I)V

    .line 302
    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 3

    .prologue
    .line 306
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a;->b:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-virtual {v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 307
    add-int/lit8 v1, p1, 0x1

    const/4 v2, 0x2

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    mul-int/2addr v1, v2

    sub-int/2addr v0, v1

    div-int/2addr v0, p1

    iput v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a;->a:I

    .line 308
    return-void
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 339
    const/4 v0, 0x1

    return v0
.end method

.method public newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 313
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030071

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 315
    new-instance v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;

    invoke-direct {v2, p0}, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;-><init>(Lcom/kik/cards/usermedia/CustomGalleryActivity$a;)V

    .line 316
    const v0, 0x7f0e0179

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->a:Landroid/widget/RelativeLayout;

    .line 317
    const v0, 0x7f0e017a

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/sdkutils/LazyLoadingImage;

    iput-object v0, v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->c:Lcom/kik/sdkutils/LazyLoadingImage;

    .line 318
    const v0, 0x7f0e017c

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->b:Landroid/widget/ImageView;

    .line 319
    const v0, 0x7f0e017b

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->d:Landroid/view/View;

    .line 321
    const/4 v0, 0x0

    iput-object v0, v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->e:Lcom/kik/cards/usermedia/q;

    .line 322
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 324
    return-object v1
.end method
