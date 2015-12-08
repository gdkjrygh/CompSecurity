.class Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter$1;
.super Landroid/widget/Filter;
.source "PlacesAutoCompleteAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->getFilter()Landroid/widget/Filter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    .line 89
    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method


# virtual methods
.method protected performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 7
    .param p1, "constraint"    # Ljava/lang/CharSequence;

    .prologue
    .line 92
    new-instance v1, Landroid/widget/Filter$FilterResults;

    invoke-direct {v1}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 93
    .local v1, "filterResults":Landroid/widget/Filter$FilterResults;
    const/4 v0, 0x0

    .line 95
    .local v0, "cursor":Landroid/database/MatrixCursor;
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-eqz v2, :cond_2

    .line 97
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    # invokes: Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->autocomplete(Ljava/lang/String;)Landroid/database/MatrixCursor;
    invoke-static {v2, v3}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->access$0(Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;Ljava/lang/String;)Landroid/database/MatrixCursor;

    move-result-object v0

    .line 107
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 109
    iput-object v0, v1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 110
    invoke-virtual {v0}, Landroid/database/MatrixCursor;->getCount()I

    move-result v2

    iput v2, v1, Landroid/widget/Filter$FilterResults;->count:I

    .line 113
    :cond_1
    return-object v1

    .line 98
    :cond_2
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    # getter for: Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->current:Lcom/google/android/gms/maps/model/LatLng;
    invoke-static {v2}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->access$1(Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    # getter for: Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->current:Lcom/google/android/gms/maps/model/LatLng;
    invoke-static {v2}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->access$1(Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-eqz v2, :cond_0

    .line 99
    if-nez v0, :cond_3

    .line 100
    new-instance v0, Landroid/database/MatrixCursor;

    .end local v0    # "cursor":Landroid/database/MatrixCursor;
    # getter for: Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->COLUMNS:[Ljava/lang/String;
    invoke-static {}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->access$2()[Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    .line 103
    .restart local v0    # "cursor":Landroid/database/MatrixCursor;
    :cond_3
    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "-1"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    # getter for: Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->currentLocation:Ljava/lang/String;
    invoke-static {v4}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->access$3(Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    .line 104
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "my_loc,"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    # getter for: Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->currentLocation:Ljava/lang/String;
    invoke-static {v5}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->access$3(Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    # getter for: Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->current:Lcom/google/android/gms/maps/model/LatLng;
    invoke-static {v5}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->access$1(Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    iget-wide v5, v5, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    # getter for: Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->current:Lcom/google/android/gms/maps/model/LatLng;
    invoke-static {v5}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->access$1(Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    iget-wide v5, v5, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 103
    invoke-virtual {v0, v2}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    goto :goto_0
.end method

.method protected publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 2
    .param p1, "constraint"    # Ljava/lang/CharSequence;
    .param p2, "results"    # Landroid/widget/Filter$FilterResults;

    .prologue
    .line 118
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    iget-object v0, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    check-cast v0, Landroid/database/Cursor;

    invoke-virtual {v1, v0}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;

    .line 120
    if-eqz p2, :cond_0

    iget v0, p2, Landroid/widget/Filter$FilterResults;->count:I

    if-lez v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->notifyDataSetChanged()V

    .line 125
    :goto_0
    return-void

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->notifyDataSetInvalidated()V

    goto :goto_0
.end method
