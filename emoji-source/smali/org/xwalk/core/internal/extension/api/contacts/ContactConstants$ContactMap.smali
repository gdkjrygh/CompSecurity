.class public Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;
.super Ljava/lang/Object;
.source "ContactConstants.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ContactMap"
.end annotation


# instance fields
.field public mDataMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public mMimeType:Ljava/lang/String;

.field public mName:Ljava/lang/String;

.field public mTypeMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public mTypeValueMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .param p1, "n"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 249
    .local p2, "datas":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .local p3, "types":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .local p4, "typeValues":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 250
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mName:Ljava/lang/String;

    .line 251
    sget-object v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->contactDataMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mMimeType:Ljava/lang/String;

    .line 252
    iput-object p2, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mDataMap:Ljava/util/Map;

    .line 253
    iput-object p3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mTypeMap:Ljava/util/Map;

    .line 254
    iput-object p4, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mTypeValueMap:Ljava/util/Map;

    .line 255
    return-void
.end method
