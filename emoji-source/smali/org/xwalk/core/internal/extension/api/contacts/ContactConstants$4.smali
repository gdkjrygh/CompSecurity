.class final Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$4;
.super Ljava/util/HashMap;
.source "ContactConstants.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    .line 159
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 160
    const-string v0, "type"

    const-string v1, "data2"

    invoke-virtual {p0, v0, v1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    const-string v0, "isPrimary"

    const-string v1, "is_primary"

    invoke-virtual {p0, v0, v1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    const-string v0, "isSuperPrimary"

    const-string v1, "is_super_primary"

    invoke-virtual {p0, v0, v1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    return-void
.end method
