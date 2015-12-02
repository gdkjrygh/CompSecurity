.class public Lcom/facebook/orca/images/ImageSearchActivity;
.super Lcom/facebook/base/activity/i;
.source "ImageSearchActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private A:Lcom/facebook/widget/listview/EmptyListViewItem;

.field private B:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private C:Ljava/lang/String;

.field private D:I

.field private E:Landroid/os/Bundle;

.field private F:Ljava/lang/String;

.field private G:I

.field private H:I

.field private I:Lcom/facebook/zero/ui/o;

.field private J:Lcom/facebook/zero/ui/l;

.field private p:Lcom/facebook/orca/images/i;

.field private q:Landroid/view/inputmethod/InputMethodManager;

.field private r:Lcom/facebook/ui/images/cache/a;

.field private s:Lcom/facebook/widget/titlebar/a;

.field private t:Landroid/widget/EditText;

.field private u:Landroid/widget/Button;

.field private v:Landroid/widget/GridView;

.field private w:Landroid/widget/RelativeLayout;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 49
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    .line 68
    iput v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->D:I

    .line 72
    iput v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->G:I

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/images/ImageSearchActivity;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->t:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/images/ImageSearchActivity;I)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0, p1}, Lcom/facebook/orca/images/ImageSearchActivity;->c(I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/images/ImageSearchActivity;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0, p1}, Lcom/facebook/orca/images/ImageSearchActivity;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/images/ImageSearchActivity;Z)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0, p1}, Lcom/facebook/orca/images/ImageSearchActivity;->b(Z)V

    return-void
.end method

.method private a(Ljava/lang/String;I)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    .line 237
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->B:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 260
    :goto_0
    return-void

    .line 242
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 243
    const-string v1, "AppId"

    const-string v2, "D41D8CD98F00B204E9800998ECF8427E465C0750"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    const-string v1, "Query"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    const-string v1, "Sources"

    const-string v2, "Image"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    const-string v1, "Version"

    const-string v2, "2.0"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    const-string v1, "Market"

    const-string v2, "en-us"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    const-string v1, "Adult"

    const-string v2, "Strict"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    const-string v1, "Image.Count"

    const-string v2, "8"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    const-string v1, "Image.Offset"

    mul-int/lit8 v2, p2, 0x8

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    iput p2, p0, Lcom/facebook/orca/images/ImageSearchActivity;->G:I

    .line 252
    iput-object p1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->F:Ljava/lang/String;

    .line 253
    iget-object v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->B:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/orca/server/aq;->B:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 255
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->v:Landroid/widget/GridView;

    invoke-virtual {v0, v3}, Landroid/widget/GridView;->setVisibility(I)V

    .line 256
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->w:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 257
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->A:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 258
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->A:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 259
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->A:Lcom/facebook/widget/listview/EmptyListViewItem;

    sget v1, Lcom/facebook/o;->image_search_loading:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/images/ImageSearchActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/images/ImageSearchActivity;)Landroid/view/inputmethod/InputMethodManager;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->q:Landroid/view/inputmethod/InputMethodManager;

    return-object v0
.end method

.method private b(Z)V
    .locals 2

    .prologue
    .line 226
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->C:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 234
    :cond_0
    :goto_0
    return-void

    .line 229
    :cond_1
    if-eqz p1, :cond_2

    iget v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->D:I

    if-lez v0, :cond_2

    .line 230
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->C:Ljava/lang/String;

    iget v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->D:I

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/images/ImageSearchActivity;->a(Ljava/lang/String;I)V

    goto :goto_0

    .line 231
    :cond_2
    if-nez p1, :cond_0

    iget v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->D:I

    iget v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->H:I

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_0

    .line 232
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->C:Ljava/lang/String;

    iget v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->D:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/images/ImageSearchActivity;->a(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method private c(I)V
    .locals 2

    .prologue
    .line 318
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->p:Lcom/facebook/orca/images/i;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/images/i;->a(I)Landroid/os/Bundle;

    move-result-object v0

    .line 319
    const-string v1, "Thumbnail"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 320
    const-string v1, "Url"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 321
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/images/b/m;->a(Landroid/net/Uri;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/o;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v0

    .line 324
    iget-object v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->r:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/m;->i()Lcom/facebook/ui/images/cache/d;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/cache/a;->f(Lcom/facebook/ui/media/cache/l;)Landroid/net/Uri;

    move-result-object v0

    .line 325
    if-eqz v0, :cond_0

    .line 326
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 327
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 328
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/images/ImageSearchActivity;->setResult(ILandroid/content/Intent;)V

    .line 329
    invoke-virtual {p0}, Lcom/facebook/orca/images/ImageSearchActivity;->finish()V

    .line 331
    :cond_0
    return-void
.end method

.method private c(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 263
    invoke-direct {p0, p1}, Lcom/facebook/orca/images/ImageSearchActivity;->d(Landroid/os/Bundle;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 264
    invoke-direct {p0}, Lcom/facebook/orca/images/ImageSearchActivity;->k()V

    .line 277
    :goto_0
    return-void

    .line 267
    :cond_0
    const-string v0, "SearchResponse"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 268
    const-string v1, "Image"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    .line 269
    const-string v2, "Total"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 270
    div-int/lit8 v1, v1, 0x8

    const/16 v2, 0x8

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->H:I

    .line 271
    iget v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->G:I

    iput v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->D:I

    .line 272
    iget-object v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->F:Ljava/lang/String;

    iput-object v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->C:Ljava/lang/String;

    .line 273
    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->E:Landroid/os/Bundle;

    .line 274
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->G:I

    .line 275
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->F:Ljava/lang/String;

    .line 276
    invoke-direct {p0}, Lcom/facebook/orca/images/ImageSearchActivity;->l()V

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/orca/images/ImageSearchActivity;)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Lcom/facebook/orca/images/ImageSearchActivity;->j()V

    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/images/ImageSearchActivity;)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Lcom/facebook/orca/images/ImageSearchActivity;->k()V

    return-void
.end method

.method private d(Landroid/os/Bundle;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 334
    const-string v0, "SearchResponse"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 335
    if-nez v0, :cond_0

    move v0, v1

    .line 347
    :goto_0
    return v0

    .line 338
    :cond_0
    const-string v2, "Image"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 339
    if-nez v0, :cond_1

    move v0, v1

    .line 340
    goto :goto_0

    .line 343
    :cond_1
    const-string v2, "Results"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 344
    if-nez v0, :cond_2

    move v0, v1

    .line 345
    goto :goto_0

    .line 347
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private j()V
    .locals 2

    .prologue
    .line 214
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->t:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 215
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 223
    :cond_0
    :goto_0
    return-void

    .line 218
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->B:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 222
    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/images/ImageSearchActivity;->a(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method private k()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, -0x1

    const/4 v0, 0x0

    .line 280
    iput v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->G:I

    .line 281
    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->F:Ljava/lang/String;

    .line 282
    iput v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->D:I

    .line 283
    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->C:Ljava/lang/String;

    .line 284
    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->E:Landroid/os/Bundle;

    .line 285
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->A:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 286
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->A:Lcom/facebook/widget/listview/EmptyListViewItem;

    sget v1, Lcom/facebook/o;->image_search_failed_to_load_images:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/images/ImageSearchActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    .line 287
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->A:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 288
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->v:Landroid/widget/GridView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setVisibility(I)V

    .line 289
    return-void
.end method

.method private l()V
    .locals 7

    .prologue
    const/4 v2, 0x4

    const/4 v5, 0x2

    const/16 v4, 0x8

    const/4 v1, 0x0

    .line 292
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->A:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 294
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->E:Landroid/os/Bundle;

    const-string v3, "Image"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 295
    const-string v3, "Results"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 297
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_0

    .line 298
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->A:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 299
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->A:Lcom/facebook/widget/listview/EmptyListViewItem;

    sget v1, Lcom/facebook/o;->image_search_no_results:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/images/ImageSearchActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    .line 300
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->w:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 301
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->v:Landroid/widget/GridView;

    invoke-virtual {v0, v4}, Landroid/widget/GridView;->setVisibility(I)V

    .line 315
    :goto_0
    return-void

    .line 303
    :cond_0
    iget-object v3, p0, Lcom/facebook/orca/images/ImageSearchActivity;->v:Landroid/widget/GridView;

    invoke-virtual {v3, v1}, Landroid/widget/GridView;->setVisibility(I)V

    .line 304
    iget-object v3, p0, Lcom/facebook/orca/images/ImageSearchActivity;->A:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v3, v4}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 305
    iget-object v3, p0, Lcom/facebook/orca/images/ImageSearchActivity;->p:Lcom/facebook/orca/images/i;

    invoke-virtual {v3, v0}, Lcom/facebook/orca/images/i;->a(Ljava/util/List;)V

    .line 306
    iget v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->D:I

    const/4 v3, -0x1

    if-eq v0, v3, :cond_1

    iget v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->H:I

    if-ge v0, v5, :cond_2

    .line 307
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->w:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 309
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->w:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 310
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->x:Landroid/widget/TextView;

    sget v3, Lcom/facebook/o;->image_search_range:I

    new-array v4, v5, [Ljava/lang/Object;

    iget v5, p0, Lcom/facebook/orca/images/ImageSearchActivity;->D:I

    add-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    const/4 v5, 0x1

    iget v6, p0, Lcom/facebook/orca/images/ImageSearchActivity;->H:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/images/ImageSearchActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 311
    iget-object v3, p0, Lcom/facebook/orca/images/ImageSearchActivity;->y:Landroid/widget/TextView;

    iget v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->D:I

    if-lez v0, :cond_3

    move v0, v1

    :goto_1
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 312
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->z:Landroid/widget/TextView;

    iget v3, p0, Lcom/facebook/orca/images/ImageSearchActivity;->D:I

    iget v4, p0, Lcom/facebook/orca/images/ImageSearchActivity;->H:I

    add-int/lit8 v4, v4, -0x1

    if-ge v3, v4, :cond_4

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_3
    move v0, v2

    .line 311
    goto :goto_1

    :cond_4
    move v1, v2

    .line 312
    goto :goto_2
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 85
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 87
    sget v0, Lcom/facebook/k;->orca_image_search:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/images/ImageSearchActivity;->setContentView(I)V

    .line 89
    invoke-virtual {p0}, Lcom/facebook/orca/images/ImageSearchActivity;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 90
    const-class v0, Lcom/facebook/orca/images/i;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/images/i;

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->p:Lcom/facebook/orca/images/i;

    .line 91
    const-class v0, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->q:Landroid/view/inputmethod/InputMethodManager;

    .line 92
    const-class v0, Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/cache/a;

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->r:Lcom/facebook/ui/images/cache/a;

    .line 93
    const-class v0, Lcom/facebook/zero/ui/o;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/ui/o;

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->I:Lcom/facebook/zero/ui/o;

    .line 95
    const-class v0, Lcom/facebook/zero/ui/l;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/ui/l;

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->J:Lcom/facebook/zero/ui/l;

    .line 97
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 98
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/images/ImageSearchActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->s:Lcom/facebook/widget/titlebar/a;

    .line 99
    sget v0, Lcom/facebook/i;->image_search_query:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/images/ImageSearchActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->t:Landroid/widget/EditText;

    .line 100
    sget v0, Lcom/facebook/i;->image_search_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/images/ImageSearchActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->u:Landroid/widget/Button;

    .line 101
    sget v0, Lcom/facebook/i;->image_search_grid:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/images/ImageSearchActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->v:Landroid/widget/GridView;

    .line 102
    sget v0, Lcom/facebook/i;->image_search_page_range_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/images/ImageSearchActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->w:Landroid/widget/RelativeLayout;

    .line 103
    sget v0, Lcom/facebook/i;->image_search_page_range:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/images/ImageSearchActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->x:Landroid/widget/TextView;

    .line 104
    sget v0, Lcom/facebook/i;->image_search_page_range_prev:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/images/ImageSearchActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->y:Landroid/widget/TextView;

    .line 105
    sget v0, Lcom/facebook/i;->image_search_page_range_next:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/images/ImageSearchActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->z:Landroid/widget/TextView;

    .line 106
    sget v0, Lcom/facebook/i;->image_search_empty_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/images/ImageSearchActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/EmptyListViewItem;

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->A:Lcom/facebook/widget/listview/EmptyListViewItem;

    .line 108
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->u:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/images/a;

    invoke-direct {v1, p0}, Lcom/facebook/orca/images/a;-><init>(Lcom/facebook/orca/images/ImageSearchActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 116
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->t:Landroid/widget/EditText;

    new-instance v1, Lcom/facebook/orca/images/b;

    invoke-direct {v1, p0}, Lcom/facebook/orca/images/b;-><init>(Lcom/facebook/orca/images/ImageSearchActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 130
    iget-object v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->t:Landroid/widget/EditText;

    invoke-virtual {p0}, Lcom/facebook/orca/images/ImageSearchActivity;->i()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v2, Lcom/facebook/analytics/bp;

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextWatcher;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 132
    const-string v0, "imageSearchOperation"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/i;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->B:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 133
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->B:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/orca/images/c;

    invoke-direct {v1, p0}, Lcom/facebook/orca/images/c;-><init>(Lcom/facebook/orca/images/ImageSearchActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 144
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->B:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/orca/m/a;

    iget-object v2, p0, Lcom/facebook/orca/images/ImageSearchActivity;->s:Lcom/facebook/widget/titlebar/a;

    invoke-direct {v1, v2}, Lcom/facebook/orca/m/a;-><init>(Lcom/facebook/widget/titlebar/a;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 146
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->y:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setClickable(Z)V

    .line 147
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->y:Landroid/widget/TextView;

    new-instance v1, Lcom/facebook/orca/images/d;

    invoke-direct {v1, p0}, Lcom/facebook/orca/images/d;-><init>(Lcom/facebook/orca/images/ImageSearchActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 153
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setClickable(Z)V

    .line 154
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->z:Landroid/widget/TextView;

    new-instance v1, Lcom/facebook/orca/images/e;

    invoke-direct {v1, p0}, Lcom/facebook/orca/images/e;-><init>(Lcom/facebook/orca/images/ImageSearchActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 161
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->v:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->p:Lcom/facebook/orca/images/i;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 162
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->v:Landroid/widget/GridView;

    new-instance v1, Lcom/facebook/orca/images/f;

    invoke-direct {v1, p0}, Lcom/facebook/orca/images/f;-><init>(Lcom/facebook/orca/images/ImageSearchActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 169
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->J:Lcom/facebook/zero/ui/l;

    sget-object v1, Lcom/facebook/zero/a/c;->j:Lcom/facebook/prefs/shared/ae;

    sget v2, Lcom/facebook/o;->zero_image_search_dialog_content:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/images/ImageSearchActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/facebook/orca/images/g;

    invoke-direct {v3, p0}, Lcom/facebook/orca/images/g;-><init>(Lcom/facebook/orca/images/ImageSearchActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;Lcom/facebook/zero/ui/k;)Lcom/facebook/zero/ui/l;

    .line 184
    iget-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->J:Lcom/facebook/zero/ui/l;

    sget-object v1, Lcom/facebook/zero/a/c;->j:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p0}, Lcom/facebook/orca/images/ImageSearchActivity;->f()Landroid/support/v4/app/q;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Landroid/support/v4/app/q;)V

    .line 186
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 81
    sget-object v0, Lcom/facebook/analytics/f/a;->IMAGE_SEARCH_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 201
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 202
    const-string v0, "currentQuery"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->C:Ljava/lang/String;

    .line 203
    const-string v0, "currentPage"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->D:I

    .line 204
    const-string v0, "currentResponse"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->E:Landroid/os/Bundle;

    .line 205
    const-string v0, "loadingQuery"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->F:Ljava/lang/String;

    .line 206
    const-string v0, "loadingPage"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->G:I

    .line 207
    const-string v0, "numPages"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->H:I

    .line 208
    iget v0, p0, Lcom/facebook/orca/images/ImageSearchActivity;->D:I

    if-ltz v0, :cond_0

    .line 209
    invoke-direct {p0}, Lcom/facebook/orca/images/ImageSearchActivity;->l()V

    .line 211
    :cond_0
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 190
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 191
    const-string v0, "currentQuery"

    iget-object v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->C:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    const-string v0, "currentPage"

    iget v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->D:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 193
    const-string v0, "currentResponse"

    iget-object v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->E:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 194
    const-string v0, "loadingQuery"

    iget-object v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->F:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    const-string v0, "loadingPage"

    iget v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->G:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 196
    const-string v0, "numPages"

    iget v1, p0, Lcom/facebook/orca/images/ImageSearchActivity;->H:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 197
    return-void
.end method
