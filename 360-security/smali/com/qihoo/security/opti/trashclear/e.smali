.class public Lcom/qihoo/security/opti/trashclear/e;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/e$1;,
        Lcom/qihoo/security/opti/trashclear/e$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const-class v0, Lcom/qihoo/security/opti/trashclear/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/opti/trashclear/e;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 833
    return-void
.end method

.method public static a(ILjava/util/Map;)Lcom/qihoo/security/opti/trashclear/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Lcom/qihoo/security/clearengine/surface/b;",
            ">;)",
            "Lcom/qihoo/security/opti/trashclear/d;"
        }
    .end annotation

    .prologue
    .line 1185
    new-instance v0, Lcom/qihoo/security/opti/trashclear/d;

    invoke-direct {v0}, Lcom/qihoo/security/opti/trashclear/d;-><init>()V

    .line 1186
    iput p0, v0, Lcom/qihoo/security/opti/trashclear/d;->m:I

    iput p0, v0, Lcom/qihoo/security/opti/trashclear/d;->q:I

    iput p0, v0, Lcom/qihoo/security/opti/trashclear/d;->o:I

    iput p0, v0, Lcom/qihoo/security/opti/trashclear/d;->a:I

    .line 1187
    iget-object v1, v0, Lcom/qihoo/security/opti/trashclear/d;->j:Lcom/qihoo/security/opti/trashclear/e$a;

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    iget-object v3, v0, Lcom/qihoo/security/opti/trashclear/d;->l:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-static {p1, v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/e;->a(Ljava/util/Map;Lcom/qihoo/security/opti/trashclear/e$a;Lcom/qihoo/security/opti/trashclear/e$a;Lcom/qihoo/security/opti/trashclear/e$a;)V

    .line 1189
    return-object v0
.end method

.method public static a(Ljava/util/Map;Lcom/qihoo/security/opti/trashclear/e$a;Lcom/qihoo/security/opti/trashclear/e$a;Lcom/qihoo/security/opti/trashclear/e$a;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Lcom/qihoo/security/clearengine/surface/b;",
            ">;",
            "Lcom/qihoo/security/opti/trashclear/e$a;",
            "Lcom/qihoo/security/opti/trashclear/e$a;",
            "Lcom/qihoo/security/opti/trashclear/e$a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 1124
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 1182
    :cond_0
    return-void

    .line 1127
    :cond_1
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    :pswitch_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1128
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/clearengine/TrashType;

    .line 1129
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/clearengine/surface/b;

    .line 1130
    iget-wide v4, v0, Lcom/qihoo/security/clearengine/surface/b;->a:J

    .line 1132
    iget-wide v6, v0, Lcom/qihoo/security/clearengine/surface/b;->b:J

    .line 1134
    sub-long v8, v6, v4

    .line 1143
    sget-object v0, Lcom/qihoo/security/opti/trashclear/e$1;->a:[I

    invoke-virtual {v1}, Lcom/qihoo/security/clearengine/TrashType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1145
    :pswitch_1
    iput-wide v6, p1, Lcom/qihoo/security/opti/trashclear/e$a;->a:J

    .line 1146
    iput-wide v4, p2, Lcom/qihoo/security/opti/trashclear/e$a;->a:J

    .line 1147
    iput-wide v8, p3, Lcom/qihoo/security/opti/trashclear/e$a;->a:J

    goto :goto_0

    .line 1150
    :pswitch_2
    iput-wide v6, p1, Lcom/qihoo/security/opti/trashclear/e$a;->k:J

    .line 1151
    iput-wide v4, p2, Lcom/qihoo/security/opti/trashclear/e$a;->k:J

    .line 1152
    iput-wide v8, p3, Lcom/qihoo/security/opti/trashclear/e$a;->k:J

    goto :goto_0

    .line 1155
    :pswitch_3
    iput-wide v6, p1, Lcom/qihoo/security/opti/trashclear/e$a;->c:J

    .line 1156
    iput-wide v4, p2, Lcom/qihoo/security/opti/trashclear/e$a;->c:J

    .line 1157
    iput-wide v8, p3, Lcom/qihoo/security/opti/trashclear/e$a;->c:J

    goto :goto_0

    .line 1160
    :pswitch_4
    iput-wide v6, p1, Lcom/qihoo/security/opti/trashclear/e$a;->i:J

    .line 1161
    iput-wide v4, p2, Lcom/qihoo/security/opti/trashclear/e$a;->i:J

    .line 1162
    iput-wide v8, p3, Lcom/qihoo/security/opti/trashclear/e$a;->i:J

    goto :goto_0

    .line 1165
    :pswitch_5
    iput-wide v6, p1, Lcom/qihoo/security/opti/trashclear/e$a;->j:J

    .line 1166
    iput-wide v4, p2, Lcom/qihoo/security/opti/trashclear/e$a;->j:J

    .line 1167
    iput-wide v8, p3, Lcom/qihoo/security/opti/trashclear/e$a;->j:J

    goto :goto_0

    .line 1170
    :pswitch_6
    iput-wide v6, p1, Lcom/qihoo/security/opti/trashclear/e$a;->b:J

    .line 1171
    iput-wide v4, p2, Lcom/qihoo/security/opti/trashclear/e$a;->b:J

    .line 1172
    iput-wide v8, p3, Lcom/qihoo/security/opti/trashclear/e$a;->b:J

    goto :goto_0

    .line 1143
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_0
    .end packed-switch
.end method
