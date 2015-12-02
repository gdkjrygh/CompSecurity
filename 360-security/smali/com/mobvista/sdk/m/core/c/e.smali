.class public final Lcom/mobvista/sdk/m/core/c/e;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 208
    const-string/jumbo v0, "CREATE TABLE IF NOT EXISTS Profile (name TEXT, ver INTEGER,time INTEGER,check_md5 TEXT,url TEXT,appid TEXT,appkey TEXT,unitid TEXT,entryClass TEXT,modPkgName TEXT,state INTEGER,downloadState INTEGER )"

    sput-object v0, Lcom/mobvista/sdk/m/core/c/e;->a:Ljava/lang/String;

    return-void
.end method
