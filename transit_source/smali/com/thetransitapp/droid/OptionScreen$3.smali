.class Lcom/thetransitapp/droid/OptionScreen$3;
.super Ljava/lang/Object;
.source "OptionScreen.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/OptionScreen;->feedUpdated()V
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
        "Lcom/thetransitapp/droid/model/TransitBundle;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/OptionScreen;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/OptionScreen;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/OptionScreen$3;->this$0:Lcom/thetransitapp/droid/OptionScreen;

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/thetransitapp/droid/model/TransitBundle;Lcom/thetransitapp/droid/model/TransitBundle;)I
    .locals 2
    .param p1, "lhs"    # Lcom/thetransitapp/droid/model/TransitBundle;
    .param p2, "rhs"    # Lcom/thetransitapp/droid/model/TransitBundle;

    .prologue
    .line 130
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitBundle;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/TransitBundle;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/thetransitapp/droid/model/TransitBundle;

    check-cast p2, Lcom/thetransitapp/droid/model/TransitBundle;

    invoke-virtual {p0, p1, p2}, Lcom/thetransitapp/droid/OptionScreen$3;->compare(Lcom/thetransitapp/droid/model/TransitBundle;Lcom/thetransitapp/droid/model/TransitBundle;)I

    move-result v0

    return v0
.end method
