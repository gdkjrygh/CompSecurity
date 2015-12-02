.class public final Lcom/mobvista/sdk/m/core/c/h;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 155
    const-string/jumbo v0, "CREATE TABLE IF NOT EXISTS Weight (id INTEGER primary key, profileName TEXT,name TEXT,weight INTEGER,unitID TEXT )"

    sput-object v0, Lcom/mobvista/sdk/m/core/c/h;->a:Ljava/lang/String;

    return-void
.end method
