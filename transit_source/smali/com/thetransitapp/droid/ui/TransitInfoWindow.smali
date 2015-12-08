.class public Lcom/thetransitapp/droid/ui/TransitInfoWindow;
.super Ljava/lang/Object;
.source "TransitInfoWindow.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;


# instance fields
.field private final activity:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/thetransitapp/droid/ui/TransitInfoWindow;->activity:Landroid/app/Activity;

    .line 19
    return-void
.end method

.method private getContent(Lcom/google/android/gms/maps/model/Marker;Ljava/util/Date;)Ljava/lang/String;
    .locals 9
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;
    .param p2, "stopTime"    # Ljava/util/Date;

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 62
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v3, v5

    const-wide/32 v5, 0xea60

    div-long/2addr v3, v5

    long-to-int v2, v3

    .line 63
    .local v2, "time":I
    iget-object v3, p0, Lcom/thetransitapp/droid/ui/TransitInfoWindow;->activity:Landroid/app/Activity;

    invoke-static {v3}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 64
    .local v1, "formatedTime":Ljava/lang/String;
    const/4 v0, 0x0

    .line 66
    .local v0, "content":Ljava/lang/String;
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getSnippet()Ljava/lang/String;

    move-result-object v3

    const-string v4, "1|"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 67
    if-lez v2, :cond_2

    .line 68
    const/16 v3, 0x5a

    if-gt v2, v3, :cond_1

    .line 69
    iget-object v3, p0, Lcom/thetransitapp/droid/ui/TransitInfoWindow;->activity:Landroid/app/Activity;

    const v4, 0x7f0a003a

    new-array v5, v8, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-virtual {v3, v4, v5}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 85
    :cond_0
    :goto_0
    return-object v0

    .line 71
    :cond_1
    iget-object v3, p0, Lcom/thetransitapp/droid/ui/TransitInfoWindow;->activity:Landroid/app/Activity;

    const v4, 0x7f0a003b

    new-array v5, v8, [Ljava/lang/Object;

    aput-object v1, v5, v7

    invoke-virtual {v3, v4, v5}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 73
    goto :goto_0

    .line 74
    :cond_2
    iget-object v3, p0, Lcom/thetransitapp/droid/ui/TransitInfoWindow;->activity:Landroid/app/Activity;

    const v4, 0x7f0a003c

    new-array v5, v8, [Ljava/lang/Object;

    aput-object v1, v5, v7

    invoke-virtual {v3, v4, v5}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 76
    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getSnippet()Ljava/lang/String;

    move-result-object v3

    const-string v4, "0|"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 78
    if-ltz v2, :cond_4

    .line 79
    iget-object v3, p0, Lcom/thetransitapp/droid/ui/TransitInfoWindow;->activity:Landroid/app/Activity;

    const v4, 0x7f0a003d

    new-array v5, v8, [Ljava/lang/Object;

    aput-object v1, v5, v7

    invoke-virtual {v3, v4, v5}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 80
    goto :goto_0

    .line 81
    :cond_4
    iget-object v3, p0, Lcom/thetransitapp/droid/ui/TransitInfoWindow;->activity:Landroid/app/Activity;

    const v4, 0x7f0a003e

    new-array v5, v8, [Ljava/lang/Object;

    aput-object v1, v5, v7

    invoke-virtual {v3, v4, v5}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public getInfoContents(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;
    .locals 7
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    const/4 v4, 0x0

    .line 28
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getTitle()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 58
    :cond_0
    :goto_0
    return-object v4

    .line 32
    :cond_1
    iget-object v5, p0, Lcom/thetransitapp/droid/ui/TransitInfoWindow;->activity:Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v5

    const v6, 0x7f03001a

    invoke-virtual {v5, v6, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 34
    .local v4, "view":Landroid/view/View;
    const v5, 0x7f050045

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 35
    .local v3, "text":Landroid/widget/TextView;
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    const v5, 0x7f050046

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .end local v3    # "text":Landroid/widget/TextView;
    check-cast v3, Landroid/widget/TextView;

    .line 38
    .restart local v3    # "text":Landroid/widget/TextView;
    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 40
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getSnippet()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getSnippet()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    .line 41
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getSnippet()Ljava/lang/String;

    move-result-object v5

    const-string v6, "|"

    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    .line 43
    .local v1, "index":I
    const/4 v5, -0x1

    if-eq v1, v5, :cond_0

    .line 45
    :try_start_0
    new-instance v2, Ljava/util/Date;

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getSnippet()Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v6, v1, 0x1

    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-direct {v2, v5, v6}, Ljava/util/Date;-><init>(J)V

    .line 46
    .local v2, "stopTime":Ljava/util/Date;
    invoke-direct {p0, p1, v2}, Lcom/thetransitapp/droid/ui/TransitInfoWindow;->getContent(Lcom/google/android/gms/maps/model/Marker;Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 48
    .local v0, "content":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 49
    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 50
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 52
    .end local v0    # "content":Ljava/lang/String;
    .end local v2    # "stopTime":Ljava/util/Date;
    :catch_0
    move-exception v5

    goto :goto_0
.end method

.method public getInfoWindow(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;
    .locals 1
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 23
    const/4 v0, 0x0

    return-object v0
.end method
