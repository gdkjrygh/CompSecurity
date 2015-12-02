.class Lcom/facebook/orca/contacts/picker/n;
.super Ljava/lang/Object;
.source "ContactPickerAddressBookFilter.java"

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
.field final synthetic a:Lcom/facebook/orca/contacts/picker/m;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/picker/m;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/n;->a:Lcom/facebook/orca/contacts/picker/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/user/User;Lcom/facebook/user/User;)I
    .locals 3

    .prologue
    .line 126
    invoke-virtual {p1}, Lcom/facebook/user/User;->w()F

    move-result v0

    .line 127
    invoke-virtual {p2}, Lcom/facebook/user/User;->w()F

    move-result v1

    .line 128
    cmpl-float v2, v0, v1

    if-lez v2, :cond_0

    .line 129
    const/4 v0, -0x1

    .line 133
    :goto_0
    return v0

    .line 130
    :cond_0
    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 131
    const/4 v0, 0x1

    goto :goto_0

    .line 133
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 123
    check-cast p1, Lcom/facebook/user/User;

    check-cast p2, Lcom/facebook/user/User;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/contacts/picker/n;->a(Lcom/facebook/user/User;Lcom/facebook/user/User;)I

    move-result v0

    return v0
.end method
