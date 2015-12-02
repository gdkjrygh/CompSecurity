.class Lcom/facebook/contacts/picker/o;
.super Ljava/lang/Object;
.source "ContactPickerFriendFilter.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/facebook/user/User;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/picker/n;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/picker/n;)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lcom/facebook/contacts/picker/o;->a:Lcom/facebook/contacts/picker/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/user/User;Lcom/facebook/user/User;)I
    .locals 3

    .prologue
    .line 101
    invoke-virtual {p1}, Lcom/facebook/user/User;->w()F

    move-result v0

    .line 102
    invoke-virtual {p2}, Lcom/facebook/user/User;->w()F

    move-result v1

    .line 103
    cmpl-float v2, v0, v1

    if-lez v2, :cond_0

    .line 104
    const/4 v0, -0x1

    .line 108
    :goto_0
    return v0

    .line 105
    :cond_0
    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 106
    const/4 v0, 0x1

    goto :goto_0

    .line 108
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 98
    check-cast p1, Lcom/facebook/user/User;

    check-cast p2, Lcom/facebook/user/User;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/picker/o;->a(Lcom/facebook/user/User;Lcom/facebook/user/User;)I

    move-result v0

    return v0
.end method
