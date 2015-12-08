.class Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;
.super Ljava/lang/Object;
.source "ContactFinder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ContactData"
.end annotation


# instance fields
.field public aAddresses:Lorg/json/JSONArray;

.field public aCategories:Lorg/json/JSONArray;

.field public aEmails:Lorg/json/JSONArray;

.field public aImpp:Lorg/json/JSONArray;

.field public aJobTitles:Lorg/json/JSONArray;

.field public aNotes:Lorg/json/JSONArray;

.field public aNumbers:Lorg/json/JSONArray;

.field public aOrganizations:Lorg/json/JSONArray;

.field public aPhotos:Lorg/json/JSONArray;

.field public aUrls:Lorg/json/JSONArray;

.field public anniversary:Ljava/lang/String;

.field public birthday:Ljava/lang/String;

.field public gender:Ljava/lang/String;

.field public lastUpdated:Ljava/lang/String;

.field public oName:Lorg/json/JSONObject;

.field final synthetic this$0:Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;


# direct methods
.method private constructor <init>(Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;)V
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->this$0:Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;
    .param p2, "x1"    # Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$1;

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;-><init>(Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;)V

    return-void
.end method

.method private ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4
    .param p1, "o"    # Lorg/json/JSONObject;
    .param p2, "jsonName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    .prologue
    .line 103
    .local p3, "t":Ljava/lang/Object;, "TT;"
    if-eqz p3, :cond_0

    :try_start_0
    invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    :cond_0
    :goto_0
    return-void

    .line 104
    :catch_0
    move-exception v0

    .line 105
    .local v0, "e":Lorg/json/JSONException;
    const-string v1, "ContactFinder"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ensurePut - Failed to add json data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method


# virtual methods
.method public ensurePut(J)Lorg/json/JSONObject;
    .locals 5
    .param p1, "id"    # J

    .prologue
    .line 78
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 80
    .local v1, "o":Lorg/json/JSONObject;
    :try_start_0
    const-string v2, "id"

    invoke-virtual {v1, v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    :goto_0
    const-string v2, "name"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->oName:Lorg/json/JSONObject;

    invoke-direct {p0, v1, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 85
    const-string v2, "lastUpdated"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->lastUpdated:Ljava/lang/String;

    invoke-direct {p0, v1, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 86
    const-string v2, "emails"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aEmails:Lorg/json/JSONArray;

    invoke-direct {p0, v1, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 87
    const-string v2, "photos"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aPhotos:Lorg/json/JSONArray;

    invoke-direct {p0, v1, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 88
    const-string v2, "urls"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aUrls:Lorg/json/JSONArray;

    invoke-direct {p0, v1, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 89
    const-string v2, "categories"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aCategories:Lorg/json/JSONArray;

    invoke-direct {p0, v1, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 90
    const-string v2, "addresses"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aAddresses:Lorg/json/JSONArray;

    invoke-direct {p0, v1, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    const-string v2, "phoneNumbers"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aNumbers:Lorg/json/JSONArray;

    invoke-direct {p0, v1, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 92
    const-string v2, "organizations"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aOrganizations:Lorg/json/JSONArray;

    invoke-direct {p0, v1, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 93
    const-string v2, "jobTitles"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aJobTitles:Lorg/json/JSONArray;

    invoke-direct {p0, v1, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 94
    const-string v2, "birthday"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->birthday:Ljava/lang/String;

    invoke-direct {p0, v1, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 95
    const-string v2, "notes"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aNotes:Lorg/json/JSONArray;

    invoke-direct {p0, v1, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 96
    const-string v2, "impp"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aImpp:Lorg/json/JSONArray;

    invoke-direct {p0, v1, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 97
    const-string v2, "anniversary"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->anniversary:Ljava/lang/String;

    invoke-direct {p0, v1, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 98
    const-string v2, "gender"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->gender:Ljava/lang/String;

    invoke-direct {p0, v1, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 99
    return-object v1

    .line 81
    :catch_0
    move-exception v0

    .line 82
    .local v0, "e":Lorg/json/JSONException;
    const-string v2, "ContactFinder"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ensurePut - Failed to build json data: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0
.end method
