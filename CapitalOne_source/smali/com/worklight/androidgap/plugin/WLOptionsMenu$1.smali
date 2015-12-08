.class Lcom/worklight/androidgap/plugin/WLOptionsMenu$1;
.super Ljava/lang/Object;
.source "WLOptionsMenu.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/worklight/androidgap/plugin/WLOptionsMenu;->getItems()Ljava/util/List;
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
        "Lcom/worklight/androidgap/plugin/WLMenuItem;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/worklight/androidgap/plugin/WLOptionsMenu;


# direct methods
.method constructor <init>(Lcom/worklight/androidgap/plugin/WLOptionsMenu;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu$1;->this$0:Lcom/worklight/androidgap/plugin/WLOptionsMenu;

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/worklight/androidgap/plugin/WLMenuItem;Lcom/worklight/androidgap/plugin/WLMenuItem;)I
    .locals 2
    .param p1, "item1"    # Lcom/worklight/androidgap/plugin/WLMenuItem;
    .param p2, "item2"    # Lcom/worklight/androidgap/plugin/WLMenuItem;

    .prologue
    .line 110
    invoke-virtual {p1}, Lcom/worklight/androidgap/plugin/WLMenuItem;->getId()I

    move-result v0

    invoke-virtual {p2}, Lcom/worklight/androidgap/plugin/WLMenuItem;->getId()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/worklight/androidgap/plugin/WLMenuItem;

    check-cast p2, Lcom/worklight/androidgap/plugin/WLMenuItem;

    invoke-virtual {p0, p1, p2}, Lcom/worklight/androidgap/plugin/WLOptionsMenu$1;->compare(Lcom/worklight/androidgap/plugin/WLMenuItem;Lcom/worklight/androidgap/plugin/WLMenuItem;)I

    move-result v0

    return v0
.end method
