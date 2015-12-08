.class final Lcom/kik/cards/web/iap/g;
.super Ljava/util/HashMap;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    .line 90
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 92
    const-string v0, "kik.wtf.zynga.com"

    const-string v1, "com.kik.cards.wtf"

    invoke-virtual {p0, v0, v1}, Lcom/kik/cards/web/iap/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    const-string v0, "static.tresensa.com"

    const-string v1, "com.kik.cards.runbun"

    invoke-virtual {p0, v0, v1}, Lcom/kik/cards/web/iap/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    const-string v0, "stickers.kik.com"

    const-string v1, "com.kik.card.sticker"

    invoke-virtual {p0, v0, v1}, Lcom/kik/cards/web/iap/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    return-void
.end method
