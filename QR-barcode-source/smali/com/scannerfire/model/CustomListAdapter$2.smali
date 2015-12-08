.class Lcom/scannerfire/model/CustomListAdapter$2;
.super Landroid/widget/Filter;
.source "CustomListAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scannerfire/model/CustomListAdapter;->getFilter()Landroid/widget/Filter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field original:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/scannerfire/model/QRModel;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/scannerfire/model/CustomListAdapter;


# direct methods
.method constructor <init>(Lcom/scannerfire/model/CustomListAdapter;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/scannerfire/model/CustomListAdapter$2;->this$0:Lcom/scannerfire/model/CustomListAdapter;

    .line 256
    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method


# virtual methods
.method protected performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 8
    .param p1, "constraint"    # Ljava/lang/CharSequence;

    .prologue
    .line 273
    const-string v5, ""

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "filtering....."

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 274
    new-instance v1, Lcom/scannerfire/db/DbAdapter;

    iget-object v5, p0, Lcom/scannerfire/model/CustomListAdapter$2;->this$0:Lcom/scannerfire/model/CustomListAdapter;

    iget-object v5, v5, Lcom/scannerfire/model/CustomListAdapter;->a:Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v1, v5}, Lcom/scannerfire/db/DbAdapter;-><init>(Landroid/content/Context;)V

    .line 275
    .local v1, "da":Lcom/scannerfire/db/DbAdapter;
    invoke-virtual {v1}, Lcom/scannerfire/db/DbAdapter;->open()Lcom/scannerfire/db/DbAdapter;

    .line 276
    invoke-virtual {v1}, Lcom/scannerfire/db/DbAdapter;->getValues()Ljava/util/ArrayList;

    move-result-object v5

    iput-object v5, p0, Lcom/scannerfire/model/CustomListAdapter$2;->original:Ljava/util/ArrayList;

    .line 277
    invoke-virtual {v1}, Lcom/scannerfire/db/DbAdapter;->close()V

    .line 279
    new-instance v4, Landroid/widget/Filter$FilterResults;

    invoke-direct {v4}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 280
    .local v4, "results":Landroid/widget/Filter$FilterResults;
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 281
    .local v0, "FilteredList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/scannerfire/model/QRModel;>;"
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_1

    .line 283
    :cond_0
    iget-object v5, p0, Lcom/scannerfire/model/CustomListAdapter$2;->original:Ljava/util/ArrayList;

    iput-object v5, v4, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 284
    iget-object v5, p0, Lcom/scannerfire/model/CustomListAdapter$2;->original:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    iput v5, v4, Landroid/widget/Filter$FilterResults;->count:I

    .line 297
    :goto_0
    return-object v4

    .line 287
    :cond_1
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    iget-object v5, p0, Lcom/scannerfire/model/CustomListAdapter$2;->original:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lt v3, v5, :cond_2

    .line 294
    iput-object v0, v4, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 295
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    iput v5, v4, Landroid/widget/Filter$FilterResults;->count:I

    goto :goto_0

    .line 288
    :cond_2
    iget-object v5, p0, Lcom/scannerfire/model/CustomListAdapter$2;->original:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/scannerfire/model/QRModel;

    .line 289
    .local v2, "data":Lcom/scannerfire/model/QRModel;
    invoke-virtual {v2}, Lcom/scannerfire/model/QRModel;->getResult()Lcom/google/zxing/Result;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 290
    const-string v5, ""

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "DATA "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " -> "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v2}, Lcom/scannerfire/model/QRModel;->getResult()Lcom/google/zxing/Result;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 291
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1
.end method

.method protected publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 2
    .param p1, "constraint"    # Ljava/lang/CharSequence;
    .param p2, "results"    # Landroid/widget/Filter$FilterResults;

    .prologue
    .line 262
    const-string v0, ""

    const-string v1, "PUBLISH RESULT"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 264
    iget-object v1, p0, Lcom/scannerfire/model/CustomListAdapter$2;->this$0:Lcom/scannerfire/model/CustomListAdapter;

    iget-object v0, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, v1, Lcom/scannerfire/model/CustomListAdapter;->m:Ljava/util/ArrayList;

    .line 265
    iget-object v0, p0, Lcom/scannerfire/model/CustomListAdapter$2;->this$0:Lcom/scannerfire/model/CustomListAdapter;

    invoke-virtual {v0}, Lcom/scannerfire/model/CustomListAdapter;->notifyDataSetChanged()V

    .line 268
    return-void
.end method
