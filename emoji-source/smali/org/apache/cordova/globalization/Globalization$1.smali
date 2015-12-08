.class Lorg/apache/cordova/globalization/Globalization$1;
.super Ljava/lang/Object;
.source "Globalization.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/globalization/Globalization;->getDateNames(Lorg/json/JSONArray;)Lorg/json/JSONObject;
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
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/globalization/Globalization;

.field final synthetic val$namesMap:Ljava/util/Map;


# direct methods
.method constructor <init>(Lorg/apache/cordova/globalization/Globalization;Ljava/util/Map;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/globalization/Globalization;

    .prologue
    .line 411
    iput-object p1, p0, Lorg/apache/cordova/globalization/Globalization$1;->this$0:Lorg/apache/cordova/globalization/Globalization;

    iput-object p2, p0, Lorg/apache/cordova/globalization/Globalization$1;->val$namesMap:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 411
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lorg/apache/cordova/globalization/Globalization$1;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public compare(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2
    .param p1, "arg0"    # Ljava/lang/String;
    .param p2, "arg1"    # Ljava/lang/String;

    .prologue
    .line 413
    iget-object v0, p0, Lorg/apache/cordova/globalization/Globalization$1;->val$namesMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iget-object v1, p0, Lorg/apache/cordova/globalization/Globalization$1;->val$namesMap:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method
