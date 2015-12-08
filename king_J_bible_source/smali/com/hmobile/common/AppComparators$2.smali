.class Lcom/hmobile/common/AppComparators$2;
.super Ljava/lang/Object;
.source "AppComparators.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/common/AppComparators;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/hmobile/model/LikeShareInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/common/AppComparators;


# direct methods
.method constructor <init>(Lcom/hmobile/common/AppComparators;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/common/AppComparators$2;->this$0:Lcom/hmobile/common/AppComparators;

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/hmobile/model/LikeShareInfo;Lcom/hmobile/model/LikeShareInfo;)I
    .locals 3
    .param p1, "object1"    # Lcom/hmobile/model/LikeShareInfo;
    .param p2, "object2"    # Lcom/hmobile/model/LikeShareInfo;

    .prologue
    .line 43
    iget v0, p1, Lcom/hmobile/model/LikeShareInfo;->shares:I

    .line 44
    .local v0, "i1":I
    iget v1, p2, Lcom/hmobile/model/LikeShareInfo;->shares:I

    .line 45
    .local v1, "i2":I
    if-ne v0, v1, :cond_0

    .line 46
    const/4 v2, 0x0

    .line 47
    :goto_0
    return v2

    :cond_0
    if-le v0, v1, :cond_1

    const/4 v2, -0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/hmobile/model/LikeShareInfo;

    check-cast p2, Lcom/hmobile/model/LikeShareInfo;

    invoke-virtual {p0, p1, p2}, Lcom/hmobile/common/AppComparators$2;->compare(Lcom/hmobile/model/LikeShareInfo;Lcom/hmobile/model/LikeShareInfo;)I

    move-result v0

    return v0
.end method
