.class public Lcom/qihoo/security/engine/a/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/a/a$a;,
        Lcom/qihoo/security/engine/a/a$b;
    }
.end annotation


# instance fields
.field public a:[Lcom/qihoo/security/engine/a/a$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lorg/json/JSONArray;)Lcom/qihoo/security/engine/a/a;
    .locals 6

    const/4 v5, -0x1

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-nez v2, :cond_1

    const/4 v0, 0x0

    :cond_0
    return-object v0

    :cond_1
    new-instance v0, Lcom/qihoo/security/engine/a/a;

    invoke-direct {v0}, Lcom/qihoo/security/engine/a/a;-><init>()V

    new-array v1, v2, [Lcom/qihoo/security/engine/a/a$a;

    iput-object v1, v0, Lcom/qihoo/security/engine/a/a;->a:[Lcom/qihoo/security/engine/a/a$a;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_0

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_3

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const-string/jumbo v4, "t"

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    if-eq v4, v5, :cond_2

    packed-switch v4, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-static {v3}, Lcom/qihoo/security/engine/a/a$a;->a(Lorg/json/JSONObject;)Lcom/qihoo/security/engine/a/a$a;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v4, v0, Lcom/qihoo/security/engine/a/a;->a:[Lcom/qihoo/security/engine/a/a$a;

    aput-object v3, v4, v1

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
