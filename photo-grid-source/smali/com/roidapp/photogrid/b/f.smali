.class public final Lcom/roidapp/photogrid/b/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/photogrid/b/g;


# direct methods
.method public static a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 103
    sget-object v0, Lcom/roidapp/photogrid/b/f;->a:Lcom/roidapp/photogrid/b/g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/b/f;->a:Lcom/roidapp/photogrid/b/g;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/b/g;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Lcom/roidapp/photogrid/b/g;)V
    .locals 0

    .prologue
    .line 99
    sput-object p0, Lcom/roidapp/photogrid/b/f;->a:Lcom/roidapp/photogrid/b/g;

    .line 100
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 169
    const-string v0, "gallery_name=%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 171
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 174
    invoke-static {}, Lcom/cm/kinfoc/s;->a()Lcom/cm/kinfoc/s;

    move-result-object v1

    const-string v2, "grid_gallery_list"

    invoke-virtual {v1, v2, v0}, Lcom/cm/kinfoc/s;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    return-void
.end method

.method public static a(Ljava/lang/String;I)V
    .locals 5

    .prologue
    .line 128
    const-string v0, "single_edit_button=%s&single_edit_button_index=%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Single_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 130
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 133
    invoke-static {}, Lcom/cm/kinfoc/s;->a()Lcom/cm/kinfoc/s;

    move-result-object v1

    const-string v2, "grid_single_edit_button"

    invoke-virtual {v1, v2, v0}, Lcom/cm/kinfoc/s;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    return-void
.end method

.method public static a(Ljava/lang/String;II)V
    .locals 4

    .prologue
    .line 250
    const-string v0, "card_name=%s&action_type=%s&ads_type=%s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 251
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 254
    invoke-static {}, Lcom/cm/kinfoc/s;->a()Lcom/cm/kinfoc/s;

    move-result-object v1

    const-string v2, "grid_cards_ads"

    invoke-virtual {v1, v2, v0}, Lcom/cm/kinfoc/s;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v4, 0x1

    .line 112
    const-string v0, "page_name=%s&from_page=%s&times=%s&uptime=%s"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    sget-object v2, Lcom/roidapp/photogrid/b/f;->a:Lcom/roidapp/photogrid/b/g;

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/roidapp/photogrid/b/f;->a:Lcom/roidapp/photogrid/b/g;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/b/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    aput-object p1, v1, v4

    const/4 v2, 0x2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 116
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 119
    invoke-static {}, Lcom/cm/kinfoc/s;->a()Lcom/cm/kinfoc/s;

    move-result-object v1

    const-string v2, "grid_page_view"

    invoke-virtual {v1, v2, v0}, Lcom/cm/kinfoc/s;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 7

    .prologue
    const/4 v4, 0x3

    const/4 v3, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 186
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v5, 0x5

    if-eq v0, v5, :cond_0

    .line 205
    :goto_0
    return-void

    .line 190
    :cond_0
    const-string v0, "SingleFilter"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    .line 193
    :goto_1
    const-string v5, "SingleRetouch"

    invoke-virtual {p0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v0, v3

    .line 196
    :cond_1
    const-string v5, "SingleSave"

    invoke-virtual {p0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v0, v4

    .line 199
    :cond_2
    const-string v5, "single_edit_button=%s&single_edit_apply=%s&single_edit_save=%s&single_edit_code=%s"

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v2

    aput-object p1, v6, v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v3

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v4

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 201
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 204
    invoke-static {}, Lcom/cm/kinfoc/s;->a()Lcom/cm/kinfoc/s;

    move-result-object v1

    const-string v2, "grid_single_filterretouch"

    invoke-virtual {v1, v2, v0}, Lcom/cm/kinfoc/s;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1
.end method

.method public static b(Ljava/lang/String;I)V
    .locals 5

    .prologue
    .line 142
    const-string v0, "grid_edit_button=%s&grid_edit_button_index=%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Grid_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 144
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 147
    invoke-static {}, Lcom/cm/kinfoc/s;->a()Lcom/cm/kinfoc/s;

    move-result-object v1

    const-string v2, "grid_grid_edit_button"

    invoke-virtual {v1, v2, v0}, Lcom/cm/kinfoc/s;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 215
    const-string v0, "single_button_save=%s&distinct_code=%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 216
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 219
    invoke-static {}, Lcom/cm/kinfoc/s;->a()Lcom/cm/kinfoc/s;

    move-result-object v1

    const-string v2, "grid_single_save"

    invoke-virtual {v1, v2, v0}, Lcom/cm/kinfoc/s;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    return-void
.end method

.method public static c(Ljava/lang/String;I)V
    .locals 5

    .prologue
    .line 156
    const-string v0, "mainpage_button_name=%s&mainpage_button_index=%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Main_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 158
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 161
    invoke-static {}, Lcom/cm/kinfoc/s;->a()Lcom/cm/kinfoc/s;

    move-result-object v1

    const-string v2, "grid_mainpage_button"

    invoke-virtual {v1, v2, v0}, Lcom/cm/kinfoc/s;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 223
    const-string v0, "single_button_share=%s&distinct_code=%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 224
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 227
    invoke-static {}, Lcom/cm/kinfoc/s;->a()Lcom/cm/kinfoc/s;

    move-result-object v1

    const-string v2, "grid_single_share"

    invoke-virtual {v1, v2, v0}, Lcom/cm/kinfoc/s;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    return-void
.end method
