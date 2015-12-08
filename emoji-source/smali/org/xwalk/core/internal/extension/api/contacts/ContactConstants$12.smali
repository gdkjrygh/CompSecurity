.class final Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$12;
.super Ljava/util/ArrayList;
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
        "Ljava/util/ArrayList",
        "<",
        "Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 260
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 261
    new-instance v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;

    const-string v1, "emails"

    sget-object v2, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->emailDataMap:Ljava/util/Map;

    sget-object v3, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->emailTypeMap:Ljava/util/Map;

    sget-object v4, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->emailTypeValuesMap:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$12;->add(Ljava/lang/Object;)Z

    .line 262
    new-instance v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;

    const-string v1, "photos"

    sget-object v2, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->photoDataMap:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v5, v5}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$12;->add(Ljava/lang/Object;)Z

    .line 263
    new-instance v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;

    const-string v1, "urls"

    sget-object v2, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->websiteDataMap:Ljava/util/Map;

    sget-object v3, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->websiteTypeMap:Ljava/util/Map;

    sget-object v4, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->websiteTypeValuesMap:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$12;->add(Ljava/lang/Object;)Z

    .line 264
    new-instance v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;

    const-string v1, "phoneNumbers"

    sget-object v2, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->phoneDataMap:Ljava/util/Map;

    sget-object v3, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->phoneTypeMap:Ljava/util/Map;

    sget-object v4, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->phoneTypeValuesMap:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$12;->add(Ljava/lang/Object;)Z

    .line 265
    new-instance v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;

    const-string v1, "addresses"

    sget-object v2, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->addressDataMap:Ljava/util/Map;

    sget-object v3, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->addressTypeMap:Ljava/util/Map;

    sget-object v4, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->addressTypeValuesMap:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$12;->add(Ljava/lang/Object;)Z

    .line 266
    new-instance v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;

    const-string v1, "organizations"

    sget-object v2, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->companyDataMap:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v5, v5}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$12;->add(Ljava/lang/Object;)Z

    .line 267
    new-instance v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;

    const-string v1, "jobTitles"

    sget-object v2, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->jobtitleDataMap:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v5, v5}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$12;->add(Ljava/lang/Object;)Z

    .line 268
    new-instance v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;

    const-string v1, "notes"

    sget-object v2, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->noteDataMap:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v5, v5}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$12;->add(Ljava/lang/Object;)Z

    .line 269
    new-instance v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;

    const-string v1, "impp"

    sget-object v2, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->imDataMap:Ljava/util/Map;

    sget-object v3, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->imTypeMap:Ljava/util/Map;

    sget-object v4, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->imTypeValuesMap:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$12;->add(Ljava/lang/Object;)Z

    .line 270
    return-void
.end method
