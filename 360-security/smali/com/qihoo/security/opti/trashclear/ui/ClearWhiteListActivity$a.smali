.class Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;
.super Landroid/widget/BaseAdapter;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

.field private final b:Landroid/view/LayoutInflater;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;Landroid/content/Context;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 193
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    .line 194
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 195
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->b:Landroid/view/LayoutInflater;

    .line 196
    if-nez p3, :cond_0

    .line 197
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->c:Ljava/util/List;

    .line 201
    :goto_0
    return-void

    .line 199
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->c:Ljava/util/List;

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->c:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;
    .locals 1

    .prologue
    .line 225
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    return-object v0
.end method

.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 204
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 205
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    .line 206
    if-eqz v0, :cond_0

    .line 207
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->c:Ljava/util/List;

    if-nez v2, :cond_1

    .line 208
    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->c:Ljava/util/List;

    .line 210
    :cond_1
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->c:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 215
    :cond_2
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->notifyDataSetChanged()V

    .line 216
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 220
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 189
    invoke-virtual {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(I)Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 230
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .prologue
    const v8, 0x7f020044

    const v6, 0x7f0b01e3

    const v3, 0x7f0b01e2

    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 238
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    .line 239
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    iget-object v2, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->desc:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->desc:Ljava/lang/String;

    .line 248
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;Z)Z

    .line 253
    iget v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iget v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    const/4 v2, -0x2

    if-eq v1, v2, :cond_0

    iget v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    const/4 v2, -0x3

    if-eq v1, v2, :cond_0

    iget v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    const/4 v2, -0x4

    if-ne v1, v2, :cond_4

    .line 255
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->b:Landroid/view/LayoutInflater;

    const v2, 0x7f030096

    invoke-virtual {v1, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 256
    iget v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 257
    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 258
    const v1, 0x7f0c0061

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 259
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 260
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020063

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 277
    :goto_0
    const-string/jumbo v0, ""

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 682
    :goto_1
    return-object p2

    .line 261
    :cond_1
    iget v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    const/4 v2, -0x2

    if-ne v1, v2, :cond_2

    .line 262
    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 263
    const v1, 0x7f0c0062

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 264
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 265
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020067

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 266
    :cond_2
    iget v0, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_3

    .line 267
    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 268
    const v1, 0x7f0c0063

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 269
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 270
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020061

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 272
    :cond_3
    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 273
    const v1, 0x7f0c0064

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 274
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 275
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020064

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 281
    :cond_4
    if-eqz p2, :cond_5

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/String;

    if-eqz v1, :cond_8

    .line 282
    :cond_5
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->b:Landroid/view/LayoutInflater;

    const v2, 0x7f030097

    invoke-virtual {v1, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 283
    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-direct {v2, v1, v4}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;-><init>(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$1;)V

    .line 285
    const v1, 0x7f0b01ec

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v1, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 286
    iget-object v1, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v5}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 287
    const v1, 0x7f0b01f3

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v1, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 288
    iget-object v1, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v5}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 298
    const v1, 0x7f0b01ea

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v1, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 299
    iget-object v1, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v5}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 300
    const v1, 0x7f0b01e6

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    .line 301
    invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v3, v2

    .line 311
    :goto_2
    iget v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    packed-switch v1, :pswitch_data_0

    .line 397
    const-string/jumbo v1, "/"

    iget-object v2, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->value:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 398
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v2, 0x7f0c0065

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 403
    :goto_3
    iget v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    const/16 v2, 0x21

    if-ne v1, v2, :cond_11

    .line 404
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->desc:Ljava/lang/String;

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->desc:Ljava/lang/String;

    const-string/jumbo v2, "Other files"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 405
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c021c

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 406
    iget-object v2, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 411
    :goto_4
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-virtual {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f020065

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 412
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "/android/data/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 413
    iget-object v2, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->value:Ljava/lang/String;

    if-eqz v2, :cond_7

    iget-object v2, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->value:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->value:Ljava/lang/String;

    const-string/jumbo v2, "/data/dalvik-cache/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 416
    :cond_6
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 484
    :cond_7
    :goto_5
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;

    invoke-direct {v2, p0, p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;-><init>(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;ILcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_1

    .line 303
    :cond_8
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;

    move-object v3, v1

    goto/16 :goto_2

    .line 314
    :pswitch_0
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->desc:Ljava/lang/String;

    .line 315
    if-eqz v1, :cond_9

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    .line 316
    iget-object v2, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 330
    :goto_6
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->value:Ljava/lang/String;

    .line 334
    :try_start_0
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Lcom/qihoo360/mobilesafe/b/g;

    move-result-object v2

    const/4 v5, 0x0

    const v6, 0x7f02014f

    invoke-virtual {v2, v5, v1, v6}, Lcom/qihoo360/mobilesafe/b/g;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v4

    .line 340
    :goto_7
    if-nez v4, :cond_a

    .line 341
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-virtual {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f020062

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 346
    :goto_8
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->value:Ljava/lang/String;

    .line 347
    if-eqz v1, :cond_b

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    .line 348
    iget-object v2, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 318
    :cond_9
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 343
    :cond_a
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_8

    .line 350
    :cond_b
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 355
    :pswitch_1
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->desc:Ljava/lang/String;

    .line 356
    if-eqz v1, :cond_c

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    .line 357
    iget-object v2, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 371
    :goto_9
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->value:Ljava/lang/String;

    .line 372
    if-eqz v1, :cond_d

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    .line 373
    iget-object v2, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 378
    :goto_a
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-virtual {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f020149

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_5

    .line 359
    :cond_c
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_9

    .line 375
    :cond_d
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_a

    .line 400
    :cond_e
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v2, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->value:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 408
    :cond_f
    iget-object v2, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->desc:Ljava/lang/String;

    if-nez v1, :cond_10

    const-string/jumbo v1, ""

    :goto_b
    invoke-virtual {v2, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    :cond_10
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->desc:Ljava/lang/String;

    goto :goto_b

    .line 418
    :cond_11
    iget v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    const/16 v2, 0x141

    if-ne v1, v2, :cond_18

    .line 419
    iget-object v2, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->desc:Ljava/lang/String;

    if-nez v1, :cond_13

    const-string/jumbo v1, ""

    :goto_c
    invoke-virtual {v2, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 444
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->bundle:Landroid/os/Bundle;

    .line 445
    if-eqz v1, :cond_17

    const-string/jumbo v2, "pkgList"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_17

    .line 447
    const-string/jumbo v2, "pkgList"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 448
    if-eqz v1, :cond_16

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_16

    move-object v6, v4

    move v4, v5

    .line 451
    :goto_d
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v4, v2, :cond_12

    .line 452
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 454
    :try_start_1
    iget-object v7, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v7}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->b(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Landroid/content/pm/PackageManager;

    move-result-object v7

    invoke-virtual {v7, v2}, Landroid/content/pm/PackageManager;->getApplicationIcon(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v6

    .line 458
    :goto_e
    if-eqz v6, :cond_14

    .line 463
    :cond_12
    if-eqz v6, :cond_15

    .line 464
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 465
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_5

    .line 419
    :cond_13
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->desc:Ljava/lang/String;

    goto :goto_c

    .line 455
    :catch_0
    move-exception v2

    .line 456
    invoke-virtual {v2}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    goto :goto_e

    .line 451
    :cond_14
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    goto :goto_d

    .line 467
    :cond_15
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-virtual {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_5

    .line 471
    :cond_16
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-virtual {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_5

    .line 474
    :cond_17
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-virtual {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_5

    .line 478
    :cond_18
    iget-object v1, v3, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_5

    .line 335
    :catch_1
    move-exception v1

    goto/16 :goto_7

    .line 311
    nop

    :pswitch_data_0
    .packed-switch 0x22
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
